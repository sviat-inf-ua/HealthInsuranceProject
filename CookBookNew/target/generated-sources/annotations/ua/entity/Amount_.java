package ua.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Amount.class)
public abstract class Amount_ extends ua.entity.AbstractEntity_ {

	public static volatile ListAttribute<Amount, Recipe> recipes;
	public static volatile SingularAttribute<Amount, BigDecimal> amount;
	public static volatile SingularAttribute<Amount, Ingredient> ingredient;
	public static volatile SingularAttribute<Amount, MeasuringSystem> system;

}

