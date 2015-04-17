package edu.emory.cci.aiw.i2b2etl.dest.metadata;

/*
 * #%L
 * AIW i2b2 ETL
 * %%
 * Copyright (C) 2012 - 2015 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Map;
import org.protempa.KnowledgeSource;
import org.protempa.PropositionDefinition;

/**
 *
 * @author Andrew Post
 */
public class DemographicsBuilder extends ParentBuilder implements SubtreeBuilder {
    private Concept root;

    public DemographicsBuilder(KnowledgeSource knowledgeSource, Map<String, PropositionDefinition> cache, Metadata metadata) throws OntologyBuildException {
        super(metadata, "Demographics", 
                MetadataUtil.DEFAULT_CONCEPT_ID_PREFIX_INTERNAL + "|Demographics", 
                metadata.getSettings().getSkipDemographicsHierarchy(),
                new DemographicsAgeBuilder(metadata),
                new DemographicsGenderBuilder(knowledgeSource, cache, metadata),
                new DemographicsLanguageBuilder(knowledgeSource, cache, metadata),
                new DemographicsMaritalStatusBuilder(knowledgeSource, cache, metadata),
                new DemographicsRaceBuilder(knowledgeSource, cache, metadata),
                new DemographicsReligionBuilder(knowledgeSource, cache, metadata),
                new DemographicsVitalStatusBuilder(knowledgeSource, cache, metadata));
    }

    @Override
    public void build(Concept parent) throws OntologyBuildException {
        super.build(parent);
        this.root = parent;
    }
    
    @Override
    public Concept[] getRoots() {
        if (this.root != null) {
            return new Concept[]{this.root};
        } else {
            return EMPTY_CONCEPT_ARRAY;
        }
    }
    
}