package ua.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Recipe.class)
public abstract class Recipe_ extends ua.entity.AbstractEntity_ {

	public static volatile SingularAttribute<Recipe, Country> country;
	public static volatile ListAttribute<Recipe, Amount> amounts;
	public static volatile SingularAttribute<Recipe, Integer> time;
	public static volatile SingularAttribute<Recipe, String> title;

}

