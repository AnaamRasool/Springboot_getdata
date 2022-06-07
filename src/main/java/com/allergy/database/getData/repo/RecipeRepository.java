package com.allergy.database.getData.repo;

import com.allergy.database.getData.models.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {


}
