package org.springframework.roo.addon.javabean.addon;

import static org.springframework.roo.model.RooJavaType.ROO_EQUALS;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.classpath.PhysicalTypeMetadata;
import org.springframework.roo.classpath.details.annotations.populator.AbstractAnnotationValues;
import org.springframework.roo.classpath.details.annotations.populator.AutoPopulate;
import org.springframework.roo.classpath.details.annotations.populator.AutoPopulationUtils;

/**
 * Represents a parsed {@link RooEquals} annotation.
 * 
 * @author Alan Stewart
 * @author Sergio Clares
 * @since 1.2.0
 */
public class EqualsAnnotationValues extends AbstractAnnotationValues {

  @AutoPopulate
  private boolean appendSuper;
  @AutoPopulate
  private String[] excludeFields;
  @AutoPopulate
  private boolean isJpaEntity;

  /**
   * Constructor
   * 
   * @param governorPhysicalTypeMetadata
   */
  public EqualsAnnotationValues(final PhysicalTypeMetadata governorPhysicalTypeMetadata) {
    super(governorPhysicalTypeMetadata, ROO_EQUALS);
    AutoPopulationUtils.populate(this, annotationMetadata);
  }

  public String[] getExcludeFields() {
    return excludeFields;
  }

  public boolean isAppendSuper() {
    return appendSuper;
  }

  public boolean isJpaEntity() {
    return isJpaEntity;
  }
}
