---
title: Light
second_title: Aspose.3D for Java API Reference
description: The light illuminates the scene.
type: docs
weight: 84
url: /java/com.aspose.threed/light/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Frustum](../../com.aspose.threed/frustum)
```
public class Light extends Frustum
```

The light illuminates the scene.

The formula to calculate the total attenuation of light is: \`\`\` A = ConstantAttenuation + (Dist \* LinearAttenuation) + ((Dist^2) \* QuadraticAttenuation) \`\`\`
## Constructors

| Constructor | Description |
| --- | --- |
| [Light()](#Light--) | Initializes a new instance of the com.aspose.threed.Light class. |
| [Light(String name)](#Light-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Light class. |
| [Light(String name, LightType type)](#Light-java.lang.String-com.aspose.threed.LightType-) | Initializes a new instance of the com.aspose.threed.Light class. |
## Methods

| Method | Description |
| --- | --- |
| [getColor()](#getColor--) | Gets the light's color |
| [setColor(Vector3 value)](#setColor-com.aspose.threed.Vector3-) | Sets the light's color |
| [getLightType()](#getLightType--) | Gets the light's type |
| [setLightType(LightType value)](#setLightType-com.aspose.threed.LightType-) | Sets the light's type |
| [getCastLight()](#getCastLight--) | Gets if the current light instance can illuminate other objects. |
| [setCastLight(boolean value)](#setCastLight-boolean-) | Sets if the current light instance can illuminate other objects. |
| [getIntensity()](#getIntensity--) | Gets the light's intensity, default value is 100 |
| [setIntensity(double value)](#setIntensity-double-) | Sets the light's intensity, default value is 100 |
| [getHotSpot()](#getHotSpot--) | Gets the hot spot cone angle(in degrees). |
| [setHotSpot(double value)](#setHotSpot-double-) | Sets the hot spot cone angle(in degrees). |
| [getFalloff()](#getFalloff--) | Gets the falloff cone angle (in degrees). |
| [setFalloff(double value)](#setFalloff-double-) | Sets the falloff cone angle (in degrees). |
| [getConstantAttenuation()](#getConstantAttenuation--) | Gets the constant attenuation to calculate the total attenuation of the light |
| [setConstantAttenuation(double value)](#setConstantAttenuation-double-) | Sets the constant attenuation to calculate the total attenuation of the light |
| [getLinearAttenuation()](#getLinearAttenuation--) | Gets the linear attenuation to calculate the total attenuation of the light |
| [setLinearAttenuation(double value)](#setLinearAttenuation-double-) | Sets the linear attenuation to calculate the total attenuation of the light |
| [getQuadraticAttenuation()](#getQuadraticAttenuation--) | Gets the quadratic attenuation to calculate the total attenuation of the light |
| [setQuadraticAttenuation(double value)](#setQuadraticAttenuation-double-) | Sets the quadratic attenuation to calculate the total attenuation of the light |
| [getCastShadows()](#getCastShadows--) | Gets if the light can cast shadows on other objects. |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets if the light can cast shadows on other objects. |
| [getShadowColor()](#getShadowColor--) | Gets the shadow's color. |
| [setShadowColor(Vector3 value)](#setShadowColor-com.aspose.threed.Vector3-) | Sets the shadow's color. |
### Light() {#Light--}
```
public Light()
```


Initializes a new instance of the com.aspose.threed.Light class.

### Light(String name) {#Light-java.lang.String-}
```
public Light(String name)
```


Initializes a new instance of the com.aspose.threed.Light class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### Light(String name, LightType type) {#Light-java.lang.String-com.aspose.threed.LightType-}
```
public Light(String name, LightType type)
```


Initializes a new instance of the com.aspose.threed.Light class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |
| type | [LightType](../../com.aspose.threed/lighttype) | New light's type |

### getColor() {#getColor--}
```
public Vector3 getColor()
```


Gets the light's color

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setColor(Vector3 value) {#setColor-com.aspose.threed.Vector3-}
```
public void setColor(Vector3 value)
```


Sets the light's color

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getLightType() {#getLightType--}
```
public LightType getLightType()
```


Gets the light's type

**Returns:**
[LightType](../../com.aspose.threed/lighttype)
### setLightType(LightType value) {#setLightType-com.aspose.threed.LightType-}
```
public void setLightType(LightType value)
```


Sets the light's type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [LightType](../../com.aspose.threed/lighttype) | New value |

### getCastLight() {#getCastLight--}
```
public boolean getCastLight()
```


Gets if the current light instance can illuminate other objects.

**Returns:**
boolean
### setCastLight(boolean value) {#setCastLight-boolean-}
```
public void setCastLight(boolean value)
```


Sets if the current light instance can illuminate other objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getIntensity() {#getIntensity--}
```
public double getIntensity()
```


Gets the light's intensity, default value is 100

**Returns:**
double
### setIntensity(double value) {#setIntensity-double-}
```
public void setIntensity(double value)
```


Sets the light's intensity, default value is 100

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getHotSpot() {#getHotSpot--}
```
public double getHotSpot()
```


Gets the hot spot cone angle(in degrees).

**Returns:**
double
### setHotSpot(double value) {#setHotSpot-double-}
```
public void setHotSpot(double value)
```


Sets the hot spot cone angle(in degrees).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getFalloff() {#getFalloff--}
```
public double getFalloff()
```


Gets the falloff cone angle (in degrees).

**Returns:**
double
### setFalloff(double value) {#setFalloff-double-}
```
public void setFalloff(double value)
```


Sets the falloff cone angle (in degrees).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getConstantAttenuation() {#getConstantAttenuation--}
```
public double getConstantAttenuation()
```


Gets the constant attenuation to calculate the total attenuation of the light

**Returns:**
double
### setConstantAttenuation(double value) {#setConstantAttenuation-double-}
```
public void setConstantAttenuation(double value)
```


Sets the constant attenuation to calculate the total attenuation of the light

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getLinearAttenuation() {#getLinearAttenuation--}
```
public double getLinearAttenuation()
```


Gets the linear attenuation to calculate the total attenuation of the light

**Returns:**
double
### setLinearAttenuation(double value) {#setLinearAttenuation-double-}
```
public void setLinearAttenuation(double value)
```


Sets the linear attenuation to calculate the total attenuation of the light

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getQuadraticAttenuation() {#getQuadraticAttenuation--}
```
public double getQuadraticAttenuation()
```


Gets the quadratic attenuation to calculate the total attenuation of the light

**Returns:**
double
### setQuadraticAttenuation(double value) {#setQuadraticAttenuation-double-}
```
public void setQuadraticAttenuation(double value)
```


Sets the quadratic attenuation to calculate the total attenuation of the light

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Gets if the light can cast shadows on other objects.

**Returns:**
boolean
### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Sets if the light can cast shadows on other objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getShadowColor() {#getShadowColor--}
```
public Vector3 getShadowColor()
```


Gets the shadow's color.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setShadowColor(Vector3 value) {#setShadowColor-com.aspose.threed.Vector3-}
```
public void setShadowColor(Vector3 value)
```


Sets the shadow's color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

