---
title: "CadMaterial"
linktitle: "CadMaterial"
second_title: "Aspose.CAD for Java"
description: "Class describing CadMaterial"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadmaterial/
---

**Inheritance:** java.lang.Object, CadBaseObject

Class describing CadMaterial

## Constructors

| Constructor | Description |
| --- | --- |
| [CadMaterial()](#CadMaterial) | Initializes a new instance of the CadMaterial class. |

## Methods

| Method | Description |
| --- | --- |
| [getMaterialName()](#getMaterialName) | Gets or sets the name of the material. |
| [setMaterialName(String value)](#setMaterialName-java.lang.String) | Gets or sets the name of the material. |
| [getDescription()](#getDescription) | Gets or sets the description. |
| [setDescription(String value)](#setDescription-java.lang.String) | Gets or sets the description. |
| [getAmbientColorMethod()](#getAmbientColorMethod) | Gets or sets the ambient color method. |
| [setAmbientColorMethod(Short value)](#setAmbientColorMethod-java.lang.Short) | Gets or sets the ambient color method. |
| [getAmbientColorFactor()](#getAmbientColorFactor) | Gets or sets the ambient color factor. |
| [setAmbientColorFactor(Double value)](#setAmbientColorFactor-java.lang.Double) | Gets or sets the ambient color factor. |
| [getAmbientColorValue()](#getAmbientColorValue) | Gets or sets the ambient color value. |
| [setAmbientColorValue(int value)](#setAmbientColorValue-int) | Gets or sets the ambient color value. |
| [getDiffuseColorMethod()](#getDiffuseColorMethod) | Gets or sets the diffuse color method. |
| [setDiffuseColorMethod(Short value)](#setDiffuseColorMethod-java.lang.Short) | Gets or sets the diffuse color method. |
| [getDiffuseColorFactor()](#getDiffuseColorFactor) | Gets or sets the diffuse color factor. |
| [setDiffuseColorFactor(Double value)](#setDiffuseColorFactor-java.lang.Double) | Gets or sets the diffuse color factor. |
| [getDiffuseColorValue()](#getDiffuseColorValue) | Gets or sets the diffuse color value. |
| [setDiffuseColorValue(int value)](#setDiffuseColorValue-int) | Gets or sets the diffuse color value. |
| [getDiffuseMapBlendFactor()](#getDiffuseMapBlendFactor) | Gets or sets the diffuse map blend factor. |
| [setDiffuseMapBlendFactor(Double value)](#setDiffuseMapBlendFactor-java.lang.Double) | Gets or sets the diffuse map blend factor. |
| [getDiffuseMapSource()](#getDiffuseMapSource) | Gets or sets the diffuse map source. |
| [setDiffuseMapSource(Short value)](#setDiffuseMapSource-java.lang.Short) | Gets or sets the diffuse map source. |
| [getDiffuseMapFileName()](#getDiffuseMapFileName) | Gets or sets the name of the diffuse map file. |
| [setDiffuseMapFileName(String value)](#setDiffuseMapFileName-java.lang.String) | Gets or sets the name of the diffuse map file. |
| [getDiffuseMapMapperProjectionMethod()](#getDiffuseMapMapperProjectionMethod) | Gets or sets the diffuse map mapper projection method. |
| [setDiffuseMapMapperProjectionMethod(Short value)](#setDiffuseMapMapperProjectionMethod-java.lang.Short) | Gets or sets the diffuse map mapper projection method. |
| [getTilingMethod()](#getTilingMethod) | Gets or sets the tiling method. |
| [setTilingMethod(Short value)](#setTilingMethod-java.lang.Short) | Gets or sets the tiling method. |
| [getAutoTransformMethod()](#getAutoTransformMethod) | Gets or sets the automatic transform method. |
| [setAutoTransformMethod(Short value)](#setAutoTransformMethod-java.lang.Short) | Gets or sets the automatic transform method. |
| [getDiffuseTransformMatrix()](#getDiffuseTransformMatrix) | Gets or sets the diffuse transform matrix. |
| [setDiffuseTransformMatrix(List<Double> value)](#setDiffuseTransformMatrix-java.util.List) | Gets or sets the diffuse transform matrix. |
| [getSpecularGlossFactor()](#getSpecularGlossFactor) | Gets or sets the specular gloss factor. |
| [setSpecularGlossFactor(Double value)](#setSpecularGlossFactor-java.lang.Double) | Gets or sets the specular gloss factor. |
| [getSpecularColorMethod()](#getSpecularColorMethod) | Gets or sets the specular color method. |
| [setSpecularColorMethod(Short value)](#setSpecularColorMethod-java.lang.Short) | Gets or sets the specular color method. |
| [getSpecularColorFactor()](#getSpecularColorFactor) | Gets or sets the specular color factor. |
| [setSpecularColorFactor(Double value)](#setSpecularColorFactor-java.lang.Double) | Gets or sets the specular color factor. |
| [getSpecularColorValue()](#getSpecularColorValue) | Gets or sets the specular color value. |
| [setSpecularColorValue(int value)](#setSpecularColorValue-int) | Gets or sets the specular color value. |
| [getSpecularMapBlendFactor()](#getSpecularMapBlendFactor) | Gets or sets the specular map blend factor. |
| [setSpecularMapBlendFactor(Double value)](#setSpecularMapBlendFactor-java.lang.Double) | Gets or sets the specular map blend factor. |
| [getSpecularMapSource()](#getSpecularMapSource) | Gets or sets the specular map source. |
| [setSpecularMapSource(Short value)](#setSpecularMapSource-java.lang.Short) | Gets or sets the specular map source. |
| [getSpecularMapFileName()](#getSpecularMapFileName) | Gets or sets the name of the specular map file. |
| [setSpecularMapFileName(String value)](#setSpecularMapFileName-java.lang.String) | Gets or sets the name of the specular map file. |
| [getSpecularMapMapperProjectionMethod()](#getSpecularMapMapperProjectionMethod) | Gets or sets the specular map mapper projection method. |
| [setSpecularMapMapperProjectionMethod(Short value)](#setSpecularMapMapperProjectionMethod-java.lang.Short) | Gets or sets the specular map mapper projection method. |
| [getSpecularMapMapperTilingMethod()](#getSpecularMapMapperTilingMethod) | Gets or sets the specular map mapper tiling method. |
| [setSpecularMapMapperTilingMethod(Short value)](#setSpecularMapMapperTilingMethod-java.lang.Short) | Gets or sets the specular map mapper tiling method. |
| [getSpecularMapMapperAutoTransformMethod()](#getSpecularMapMapperAutoTransformMethod) | Gets or sets the specular map mapper automatic transform method. |
| [setSpecularMapMapperAutoTransformMethod(Short value)](#setSpecularMapMapperAutoTransformMethod-java.lang.Short) | Gets or sets the specular map mapper automatic transform method. |
| [getSpecularMapMapperTransformMatrix()](#getSpecularMapMapperTransformMatrix) | Gets or sets the specular map mapper transform matrix. |
| [setSpecularMapMapperTransformMatrix(List<Double> value)](#setSpecularMapMapperTransformMatrix-java.util.List) | Gets or sets the specular map mapper transform matrix. |
| [getReflectionMapBlendFactor()](#getReflectionMapBlendFactor) | Gets or sets the reflection map blend factor. |
| [setReflectionMapBlendFactor(Double value)](#setReflectionMapBlendFactor-java.lang.Double) | Gets or sets the reflection map blend factor. |
| [getReflectionMapSource()](#getReflectionMapSource) | Gets or sets the reflection map source. |
| [setReflectionMapSource(Short value)](#setReflectionMapSource-java.lang.Short) | Gets or sets the reflection map source. |
| [getReflectionMapFileName()](#getReflectionMapFileName) | Gets or sets the name of the reflection map file. |
| [setReflectionMapFileName(String value)](#setReflectionMapFileName-java.lang.String) | Gets or sets the name of the reflection map file. |
| [getReflectionMapMapperProjectionMethod()](#getReflectionMapMapperProjectionMethod) | Gets or sets the reflection map mapper projection method. |
| [setReflectionMapMapperProjectionMethod(Short value)](#setReflectionMapMapperProjectionMethod-java.lang.Short) | Gets or sets the reflection map mapper projection method. |
| [getReflectionMapMapperTilingMethod()](#getReflectionMapMapperTilingMethod) | Gets or sets the reflection map mapper tiling method. |
| [setReflectionMapMapperTilingMethod(Short value)](#setReflectionMapMapperTilingMethod-java.lang.Short) | Gets or sets the reflection map mapper tiling method. |
| [getReflectionMapMapperAutoTransformMethod()](#getReflectionMapMapperAutoTransformMethod) | Gets or sets the reflection map mapper automatic transform method. |
| [setReflectionMapMapperAutoTransformMethod(Short value)](#setReflectionMapMapperAutoTransformMethod-java.lang.Short) | Gets or sets the reflection map mapper automatic transform method. |
| [getReflectionMapMapperTransformMatrix()](#getReflectionMapMapperTransformMatrix) | Gets or sets the reflection map mapper transform matrix. |
| [setReflectionMapMapperTransformMatrix(List<Double> value)](#setReflectionMapMapperTransformMatrix-java.util.List) | Gets or sets the reflection map mapper transform matrix. |
| [getOpacityPercent()](#getOpacityPercent) | Gets or sets the opacity percent. |
| [setOpacityPercent(Double value)](#setOpacityPercent-java.lang.Double) | Gets or sets the opacity percent. |
| [getOpacityMapBlendFactor()](#getOpacityMapBlendFactor) | Gets or sets the opacity map blend factor. |
| [setOpacityMapBlendFactor(Double value)](#setOpacityMapBlendFactor-java.lang.Double) | Gets or sets the opacity map blend factor. |
| [getOpacityMapSource()](#getOpacityMapSource) | Gets or sets the opacity map source. |
| [setOpacityMapSource(Short value)](#setOpacityMapSource-java.lang.Short) | Gets or sets the opacity map source. |
| [getOpacityMapFileName()](#getOpacityMapFileName) | Gets or sets the name of the opacity map file. |
| [setOpacityMapFileName(String value)](#setOpacityMapFileName-java.lang.String) | Gets or sets the name of the opacity map file. |
| [getOpacityMapMapperProjectionMethod()](#getOpacityMapMapperProjectionMethod) | Gets or sets the opacity map mapper projection method. |
| [setOpacityMapMapperProjectionMethod(Short value)](#setOpacityMapMapperProjectionMethod-java.lang.Short) | Gets or sets the opacity map mapper projection method. |
| [getOpacityMapMapperTilingMethod()](#getOpacityMapMapperTilingMethod) | Gets or sets the opacity map mapper tiling method. |
| [setOpacityMapMapperTilingMethod(Short value)](#setOpacityMapMapperTilingMethod-java.lang.Short) | Gets or sets the opacity map mapper tiling method. |
| [getOpacityMapMapperAutoTransformMethod()](#getOpacityMapMapperAutoTransformMethod) | Gets or sets the opacity map mapper automatic transform method. |
| [setOpacityMapMapperAutoTransformMethod(Short value)](#setOpacityMapMapperAutoTransformMethod-java.lang.Short) | Gets or sets the opacity map mapper automatic transform method. |
| [getOpacityMapMapperTransformMatrix()](#getOpacityMapMapperTransformMatrix) | Gets or sets the opacity map mapper transform matrix. |
| [setOpacityMapMapperTransformMatrix(List<Double> value)](#setOpacityMapMapperTransformMatrix-java.util.List) | Gets or sets the opacity map mapper transform matrix. |
| [getBumpMapBlendFactor()](#getBumpMapBlendFactor) | Gets or sets the bump map blend factor. |
| [setBumpMapBlendFactor(Double value)](#setBumpMapBlendFactor-java.lang.Double) | Gets or sets the bump map blend factor. |
| [getBumpMapSource()](#getBumpMapSource) | Gets or sets the bump map source. |
| [setBumpMapSource(Short value)](#setBumpMapSource-java.lang.Short) | Gets or sets the bump map source. |
| [getBumpMapFileName()](#getBumpMapFileName) | Gets or sets the name of the bump map file. |
| [setBumpMapFileName(String value)](#setBumpMapFileName-java.lang.String) | Gets or sets the name of the bump map file. |
| [getBumpMapMapperProjectionMethod()](#getBumpMapMapperProjectionMethod) | Gets or sets the bump map mapper projection method. |
| [setBumpMapMapperProjectionMethod(Short value)](#setBumpMapMapperProjectionMethod-java.lang.Short) | Gets or sets the bump map mapper projection method. |
| [getBumpMapMapperTilingMethod()](#getBumpMapMapperTilingMethod) | Gets or sets the bump map mapper tiling method. |
| [setBumpMapMapperTilingMethod(Short value)](#setBumpMapMapperTilingMethod-java.lang.Short) | Gets or sets the bump map mapper tiling method. |
| [getBumpMapMapperAutoTransformMethod()](#getBumpMapMapperAutoTransformMethod) | Gets or sets the bump map mapper automatic transform method. |
| [setBumpMapMapperAutoTransformMethod(short value)](#setBumpMapMapperAutoTransformMethod-short) | Gets or sets the bump map mapper automatic transform method. |
| [getBumpMapMapperTransformMatrix()](#getBumpMapMapperTransformMatrix) | Gets or sets the bump map mapper transform matrix. |
| [setBumpMapMapperTransformMatrix(List<Double> value)](#setBumpMapMapperTransformMatrix-java.util.List) | Gets or sets the bump map mapper transform matrix. |
| [getRefractionIndex()](#getRefractionIndex) | Gets or sets the index of the refraction. |
| [setRefractionIndex(Double value)](#setRefractionIndex-java.lang.Double) | Gets or sets the index of the refraction. |
| [getRefractionMapBlendFactor()](#getRefractionMapBlendFactor) | Gets or sets the refraction map blend factor. |
| [setRefractionMapBlendFactor(Double value)](#setRefractionMapBlendFactor-java.lang.Double) | Gets or sets the refraction map blend factor. |
| [getRefractionMapSource()](#getRefractionMapSource) | Gets or sets the refraction map source. |
| [setRefractionMapSource(short value)](#setRefractionMapSource-short) | Gets or sets the refraction map source. |
| [getRefractionMapFileName()](#getRefractionMapFileName) | Gets or sets the name of the refraction map file. |
| [setRefractionMapFileName(String value)](#setRefractionMapFileName-java.lang.String) | Gets or sets the name of the refraction map file. |
| [getRefractionMapMapperProjectionMethod()](#getRefractionMapMapperProjectionMethod) | Gets or sets the refraction map mapper projection method. |
| [setRefractionMapMapperProjectionMethod(Short value)](#setRefractionMapMapperProjectionMethod-java.lang.Short) | Gets or sets the refraction map mapper projection method. |
| [getRefractionMapMapperTilingMethod()](#getRefractionMapMapperTilingMethod) | Gets or sets the refraction map mapper tiling method. |
| [setRefractionMapMapperTilingMethod(Short value)](#setRefractionMapMapperTilingMethod-java.lang.Short) | Gets or sets the refraction map mapper tiling method. |
| [getRefractionMapMapperAutoTransformMethod()](#getRefractionMapMapperAutoTransformMethod) | Gets or sets the refraction map mapper automatic transform method. |
| [setRefractionMapMapperAutoTransformMethod(Short value)](#setRefractionMapMapperAutoTransformMethod-java.lang.Short) | Gets or sets the refraction map mapper automatic transform method. |
| [getRefractionMapMapperTransformMatrix()](#getRefractionMapMapperTransformMatrix) | Gets or sets the refraction map mapper transform matrix. |
| [setRefractionMapMapperTransformMatrix(List<Double> value)](#setRefractionMapMapperTransformMatrix-java.util.List) | Gets or sets the refraction map mapper transform matrix. |
| [getColorBleedScale()](#getColorBleedScale) | Gets or sets the color bleed scale. |
| [setColorBleedScale(Double value)](#setColorBleedScale-java.lang.Double) | Gets or sets the color bleed scale. |
| [getIndirectDumpScale()](#getIndirectDumpScale) | Gets or sets the indirect dump scale. |
| [setIndirectDumpScale(Double value)](#setIndirectDumpScale-java.lang.Double) | Gets or sets the indirect dump scale. |
| [getReflectanceScale()](#getReflectanceScale) | Gets or sets the reflectance scale. |
| [setReflectanceScale(Double value)](#setReflectanceScale-java.lang.Double) | Gets or sets the reflectance scale. |
| [getTransmittanceScale()](#getTransmittanceScale) | Gets or sets the transmittance scale. |
| [setTransmittanceScale(Double value)](#setTransmittanceScale-java.lang.Double) | Gets or sets the transmittance scale. |
| [getTwoSidedMaterial()](#getTwoSidedMaterial) | Gets or sets the two sided material. |
| [setTwoSidedMaterial(Boolean value)](#setTwoSidedMaterial-java.lang.Boolean) | Gets or sets the two sided material. |
| [getLuminance()](#getLuminance) | Gets or sets the luminance. |
| [setLuminance(Double value)](#setLuminance-java.lang.Double) | Gets or sets the luminance. |
| [getLuminanceMode()](#getLuminanceMode) | Gets or sets the luminance mode. |
| [setLuminanceMode(Short value)](#setLuminanceMode-java.lang.Short) | Gets or sets the luminance mode. |
| [getNormalMapMethod()](#getNormalMapMethod) | Gets or sets the normal map method. |
| [setNormalMapMethod(Short value)](#setNormalMapMethod-java.lang.Short) | Gets or sets the normal map method. |
| [getNormalMapStrength()](#getNormalMapStrength) | Gets or sets the normal map strength. |
| [setNormalMapStrength(Double value)](#setNormalMapStrength-java.lang.Double) | Gets or sets the normal map strength. |
| [getNormalMapBlendFactor()](#getNormalMapBlendFactor) | Gets or sets the normal map blend factor. |
| [setNormalMapBlendFactor(Double value)](#setNormalMapBlendFactor-java.lang.Double) | Gets or sets the normal map blend factor. |
| [getNormalMapSource()](#getNormalMapSource) | Gets or sets the normal map source. |
| [setNormalMapSource(Short value)](#setNormalMapSource-java.lang.Short) | Gets or sets the normal map source. |
| [getNormalMapSourceFileName()](#getNormalMapSourceFileName) | Gets or sets the name of the normal map source file. |
| [setNormalMapSourceFileName(String value)](#setNormalMapSourceFileName-java.lang.String) | Gets or sets the name of the normal map source file. |
| [getNormalMapperProjection()](#getNormalMapperProjection) | Gets or sets the normal mapper projection. |
| [setNormalMapperProjection(Short value)](#setNormalMapperProjection-java.lang.Short) | Gets or sets the normal mapper projection. |
| [getNormalMapperTiling()](#getNormalMapperTiling) | Gets or sets the normal mapper tiling. |
| [setNormalMapperTiling(Short value)](#setNormalMapperTiling-java.lang.Short) | Gets or sets the normal mapper tiling. |
| [getNormalMapperAutoTransform()](#getNormalMapperAutoTransform) | Gets or sets the normal mapper automatic transform. |
| [setNormalMapperAutoTransform(Short value)](#setNormalMapperAutoTransform-java.lang.Short) | Gets or sets the normal mapper automatic transform. |
| [getNormalMapperTransform()](#getNormalMapperTransform) | Gets or sets the normal mapper transform. |
| [setNormalMapperTransform(Double value)](#setNormalMapperTransform-java.lang.Double) | Gets or sets the normal mapper transform. |
| [getMaterialsAnonymous()](#getMaterialsAnonymous) | Gets or sets the materials anonymous. |
| [setMaterialsAnonymous(Boolean value)](#setMaterialsAnonymous-java.lang.Boolean) | Gets or sets the materials anonymous. |
| [getGlobalIlluminationMode()](#getGlobalIlluminationMode) | Gets or sets the global illumination mode. |
| [setGlobalIlluminationMode(Short value)](#setGlobalIlluminationMode-java.lang.Short) | Gets or sets the global illumination mode. |
| [getFinalGatherMode()](#getFinalGatherMode) | Gets or sets the final gather mode. |
| [setFinalGatherMode(Short value)](#setFinalGatherMode-java.lang.Short) | Gets or sets the final gather mode. |
| [getGenProcName()](#getGenProcName) | Gets or sets the name of the gen proc. |
| [setGenProcName(String value)](#setGenProcName-java.lang.String) | Gets or sets the name of the gen proc. |
| [getGenProcValBool()](#getGenProcValBool) | Gets or sets the gen proc value bool. |
| [setGenProcValBool(Boolean value)](#setGenProcValBool-java.lang.Boolean) | Gets or sets the gen proc value bool. |
| [getGenProcValInt()](#getGenProcValInt) | Gets or sets the gen proc value int. |
| [setGenProcValInt(Short value)](#setGenProcValInt-java.lang.Short) | Gets or sets the gen proc value int. |
| [getGenProcValReal()](#getGenProcValReal) | Gets or sets the gen proc value real. |
| [setGenProcValReal(Double value)](#setGenProcValReal-java.lang.Double) | Gets or sets the gen proc value real. |
| [getGenProcValText()](#getGenProcValText) | Gets or sets the gen proc value text. |
| [setGenProcValText(String value)](#setGenProcValText-java.lang.String) | Gets or sets the gen proc value text. |
| [getGenProcTableEnd()](#getGenProcTableEnd) | Gets or sets the gen proc table end. |
| [setGenProcTableEnd(Boolean value)](#setGenProcTableEnd-java.lang.Boolean) | Gets or sets the gen proc table end. |
| [getGenProcValColorIndex()](#getGenProcValColorIndex) | Gets or sets the index of the gen proc value color. |
| [setGenProcValColorIndex(Integer value)](#setGenProcValColorIndex-java.lang.Integer) | Gets or sets the index of the gen proc value color. |
| [getGenProcValColorRGB()](#getGenProcValColorRGB) | Gets or sets the gen proc value color RGB. |
| [setGenProcValColorRGB(Integer value)](#setGenProcValColorRGB-java.lang.Integer) | Gets or sets the gen proc value color RGB. |
| [getGenProcValColorName()](#getGenProcValColorName) | Gets or sets the name of the gen proc value color. |
| [setGenProcValColorName(String value)](#setGenProcValColorName-java.lang.String) | Gets or sets the name of the gen proc value color. |
| [getMapUTile()](#getMapUTile) | Gets or sets the map u tile. |
| [setMapUTile(Short value)](#setMapUTile-java.lang.Short) | Gets or sets the map u tile. |
| [getTranslucence()](#getTranslucence) | Gets or sets the translucence. |
| [setTranslucence(Double value)](#setTranslucence-java.lang.Double) | Gets or sets the translucence. |
| [getSelfIlluminaton()](#getSelfIlluminaton) | Gets or sets the self illuminaton. |
| [setSelfIlluminaton(Integer value)](#setSelfIlluminaton-java.lang.Integer) | Gets or sets the self illuminaton. |
| [getReflectivity()](#getReflectivity) | Gets or sets the reflectivity. |
| [setReflectivity(Double value)](#setReflectivity-java.lang.Double) | Gets or sets the reflectivity. |
| [getIlluminationModel()](#getIlluminationModel) | Gets or sets the illumination model. |
| [setIlluminationModel(Integer value)](#setIlluminationModel-java.lang.Integer) | Gets or sets the illumination model. |
| [getChannelFlags()](#getChannelFlags) | Gets or sets the channel flags. |
| [setChannelFlags(Integer value)](#setChannelFlags-java.lang.Integer) | Gets or sets the channel flags. |
| [getAttribute282()](#getAttribute282) | Gets or sets the 282 attribute. |
| [setAttribute282(Short value)](#setAttribute282-java.lang.Short) | Gets or sets the 282 attribute. |

### CadMaterial() {#CadMaterial}
```java
public CadMaterial()
```

Initializes a new instance of the CadMaterial class.

### getMaterialName() {#getMaterialName}
```java
public final String getMaterialName()
```

Gets or sets the name of the material.

**Returns:** String - The name of the material.

### setMaterialName(String value) {#setMaterialName-java.lang.String}
```java
public final void setMaterialName(String value)
```

Gets or sets the name of the material.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the material. |

### getDescription() {#getDescription}
```java
public final String getDescription()
```

Gets or sets the description.

**Returns:** String - The description.

### setDescription(String value) {#setDescription-java.lang.String}
```java
public final void setDescription(String value)
```

Gets or sets the description.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The description. |

### getAmbientColorMethod() {#getAmbientColorMethod}
```java
public final Short getAmbientColorMethod()
```

Gets or sets the ambient color method.

**Returns:** Short - The ambient color method.

### setAmbientColorMethod(Short value) {#setAmbientColorMethod-java.lang.Short}
```java
public final void setAmbientColorMethod(Short value)
```

Gets or sets the ambient color method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The ambient color method. |

### getAmbientColorFactor() {#getAmbientColorFactor}
```java
public final Double getAmbientColorFactor()
```

Gets or sets the ambient color factor.

**Returns:** Double - The ambient color factor.

### setAmbientColorFactor(Double value) {#setAmbientColorFactor-java.lang.Double}
```java
public final void setAmbientColorFactor(Double value)
```

Gets or sets the ambient color factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The ambient color factor. |

### getAmbientColorValue() {#getAmbientColorValue}
```java
public final int getAmbientColorValue()
```

Gets or sets the ambient color value.

**Returns:** int - The ambient color value.

### setAmbientColorValue(int value) {#setAmbientColorValue-int}
```java
public final void setAmbientColorValue(int value)
```

Gets or sets the ambient color value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The ambient color value. |

### getDiffuseColorMethod() {#getDiffuseColorMethod}
```java
public final Short getDiffuseColorMethod()
```

Gets or sets the diffuse color method.

**Returns:** Short - The diffuse color method.

### setDiffuseColorMethod(Short value) {#setDiffuseColorMethod-java.lang.Short}
```java
public final void setDiffuseColorMethod(Short value)
```

Gets or sets the diffuse color method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The diffuse color method. |

### getDiffuseColorFactor() {#getDiffuseColorFactor}
```java
public final Double getDiffuseColorFactor()
```

Gets or sets the diffuse color factor.

**Returns:** Double - The diffuse color factor.

### setDiffuseColorFactor(Double value) {#setDiffuseColorFactor-java.lang.Double}
```java
public final void setDiffuseColorFactor(Double value)
```

Gets or sets the diffuse color factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The diffuse color factor. |

### getDiffuseColorValue() {#getDiffuseColorValue}
```java
public final int getDiffuseColorValue()
```

Gets or sets the diffuse color value.

**Returns:** int - The diffuse color value.

### setDiffuseColorValue(int value) {#setDiffuseColorValue-int}
```java
public final void setDiffuseColorValue(int value)
```

Gets or sets the diffuse color value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The diffuse color value. |

### getDiffuseMapBlendFactor() {#getDiffuseMapBlendFactor}
```java
public final Double getDiffuseMapBlendFactor()
```

Gets or sets the diffuse map blend factor.

**Returns:** Double - The diffuse map blend factor.

### setDiffuseMapBlendFactor(Double value) {#setDiffuseMapBlendFactor-java.lang.Double}
```java
public final void setDiffuseMapBlendFactor(Double value)
```

Gets or sets the diffuse map blend factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The diffuse map blend factor. |

### getDiffuseMapSource() {#getDiffuseMapSource}
```java
public final Short getDiffuseMapSource()
```

Gets or sets the diffuse map source.

**Returns:** Short - The diffuse map source.

### setDiffuseMapSource(Short value) {#setDiffuseMapSource-java.lang.Short}
```java
public final void setDiffuseMapSource(Short value)
```

Gets or sets the diffuse map source.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The diffuse map source. |

### getDiffuseMapFileName() {#getDiffuseMapFileName}
```java
public final String getDiffuseMapFileName()
```

Gets or sets the name of the diffuse map file.

**Returns:** String - The name of the diffuse map file.

### setDiffuseMapFileName(String value) {#setDiffuseMapFileName-java.lang.String}
```java
public final void setDiffuseMapFileName(String value)
```

Gets or sets the name of the diffuse map file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the diffuse map file. |

### getDiffuseMapMapperProjectionMethod() {#getDiffuseMapMapperProjectionMethod}
```java
public final Short getDiffuseMapMapperProjectionMethod()
```

Gets or sets the diffuse map mapper projection method.

**Returns:** Short - The diffuse map mapper prn method.

### setDiffuseMapMapperProjectionMethod(Short value) {#setDiffuseMapMapperProjectionMethod-java.lang.Short}
```java
public final void setDiffuseMapMapperProjectionMethod(Short value)
```

Gets or sets the diffuse map mapper projection method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The diffuse map mapper projection method. |

### getTilingMethod() {#getTilingMethod}
```java
public final Short getTilingMethod()
```

Gets or sets the tiling method.

**Returns:** Short - The tiling method.

### setTilingMethod(Short value) {#setTilingMethod-java.lang.Short}
```java
public final void setTilingMethod(Short value)
```

Gets or sets the tiling method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The tiling method. |

### getAutoTransformMethod() {#getAutoTransformMethod}
```java
public final Short getAutoTransformMethod()
```

Gets or sets the automatic transform method.

**Returns:** Short - The automatic transform method.

### setAutoTransformMethod(Short value) {#setAutoTransformMethod-java.lang.Short}
```java
public final void setAutoTransformMethod(Short value)
```

Gets or sets the automatic transform method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The automatic transform method. |

### getDiffuseTransformMatrix() {#getDiffuseTransformMatrix}
```java
public final List<Double> getDiffuseTransformMatrix()
```

Gets or sets the diffuse transform matrix.

**Returns:** List<Double> - The diffuse transform matrix.

### setDiffuseTransformMatrix(List<Double> value) {#setDiffuseTransformMatrix-java.util.List}
```java
public final void setDiffuseTransformMatrix(List<Double> value)
```

Gets or sets the diffuse transform matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Double> | The diffuse transform matrix. |

### getSpecularGlossFactor() {#getSpecularGlossFactor}
```java
public final Double getSpecularGlossFactor()
```

Gets or sets the specular gloss factor.

**Returns:** Double - The specular gloss factor.

### setSpecularGlossFactor(Double value) {#setSpecularGlossFactor-java.lang.Double}
```java
public final void setSpecularGlossFactor(Double value)
```

Gets or sets the specular gloss factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The specular gloss factor. |

### getSpecularColorMethod() {#getSpecularColorMethod}
```java
public final Short getSpecularColorMethod()
```

Gets or sets the specular color method.

**Returns:** Short - The specular color method.

### setSpecularColorMethod(Short value) {#setSpecularColorMethod-java.lang.Short}
```java
public final void setSpecularColorMethod(Short value)
```

Gets or sets the specular color method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The specular color method. |

### getSpecularColorFactor() {#getSpecularColorFactor}
```java
public final Double getSpecularColorFactor()
```

Gets or sets the specular color factor.

**Returns:** Double - The specular color factor.

### setSpecularColorFactor(Double value) {#setSpecularColorFactor-java.lang.Double}
```java
public final void setSpecularColorFactor(Double value)
```

Gets or sets the specular color factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The specular color factor. |

### getSpecularColorValue() {#getSpecularColorValue}
```java
public final int getSpecularColorValue()
```

Gets or sets the specular color value.

**Returns:** int - The specular color value.

### setSpecularColorValue(int value) {#setSpecularColorValue-int}
```java
public final void setSpecularColorValue(int value)
```

Gets or sets the specular color value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The specular color value. |

### getSpecularMapBlendFactor() {#getSpecularMapBlendFactor}
```java
public final Double getSpecularMapBlendFactor()
```

Gets or sets the specular map blend factor.

**Returns:** Double - The specular map blend factor.

### setSpecularMapBlendFactor(Double value) {#setSpecularMapBlendFactor-java.lang.Double}
```java
public final void setSpecularMapBlendFactor(Double value)
```

Gets or sets the specular map blend factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The specular map blend factor. |

### getSpecularMapSource() {#getSpecularMapSource}
```java
public final Short getSpecularMapSource()
```

Gets or sets the specular map source.

**Returns:** Short - The specular map source.

### setSpecularMapSource(Short value) {#setSpecularMapSource-java.lang.Short}
```java
public final void setSpecularMapSource(Short value)
```

Gets or sets the specular map source.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The specular map source. |

### getSpecularMapFileName() {#getSpecularMapFileName}
```java
public final String getSpecularMapFileName()
```

Gets or sets the name of the specular map file.

**Returns:** String - The name of the specular map file.

### setSpecularMapFileName(String value) {#setSpecularMapFileName-java.lang.String}
```java
public final void setSpecularMapFileName(String value)
```

Gets or sets the name of the specular map file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the specular map file. |

### getSpecularMapMapperProjectionMethod() {#getSpecularMapMapperProjectionMethod}
```java
public final Short getSpecularMapMapperProjectionMethod()
```

Gets or sets the specular map mapper projection method.

**Returns:** Short - The specular map mapper projection method.

### setSpecularMapMapperProjectionMethod(Short value) {#setSpecularMapMapperProjectionMethod-java.lang.Short}
```java
public final void setSpecularMapMapperProjectionMethod(Short value)
```

Gets or sets the specular map mapper projection method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The specular map mapper projection method. |

### getSpecularMapMapperTilingMethod() {#getSpecularMapMapperTilingMethod}
```java
public final Short getSpecularMapMapperTilingMethod()
```

Gets or sets the specular map mapper tiling method.

**Returns:** Short - The specular map mapper tiling method.

### setSpecularMapMapperTilingMethod(Short value) {#setSpecularMapMapperTilingMethod-java.lang.Short}
```java
public final void setSpecularMapMapperTilingMethod(Short value)
```

Gets or sets the specular map mapper tiling method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The specular map mapper tiling method. |

### getSpecularMapMapperAutoTransformMethod() {#getSpecularMapMapperAutoTransformMethod}
```java
public final Short getSpecularMapMapperAutoTransformMethod()
```

Gets or sets the specular map mapper automatic transform method.

**Returns:** Short - The specular map mapper automatic transform method.

### setSpecularMapMapperAutoTransformMethod(Short value) {#setSpecularMapMapperAutoTransformMethod-java.lang.Short}
```java
public final void setSpecularMapMapperAutoTransformMethod(Short value)
```

Gets or sets the specular map mapper automatic transform method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The specular map mapper automatic transform method. |

### getSpecularMapMapperTransformMatrix() {#getSpecularMapMapperTransformMatrix}
```java
public final List<Double> getSpecularMapMapperTransformMatrix()
```

Gets or sets the specular map mapper transform matrix.

**Returns:** List<Double> - The specular map mapper transform matrix.

### setSpecularMapMapperTransformMatrix(List<Double> value) {#setSpecularMapMapperTransformMatrix-java.util.List}
```java
public final void setSpecularMapMapperTransformMatrix(List<Double> value)
```

Gets or sets the specular map mapper transform matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Double> | The specular map mapper transform matrix. |

### getReflectionMapBlendFactor() {#getReflectionMapBlendFactor}
```java
public final Double getReflectionMapBlendFactor()
```

Gets or sets the reflection map blend factor.

**Returns:** Double - The reflection map blend factor.

### setReflectionMapBlendFactor(Double value) {#setReflectionMapBlendFactor-java.lang.Double}
```java
public final void setReflectionMapBlendFactor(Double value)
```

Gets or sets the reflection map blend factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The reflection map blend factor. |

### getReflectionMapSource() {#getReflectionMapSource}
```java
public final Short getReflectionMapSource()
```

Gets or sets the reflection map source.

**Returns:** Short - The reflection map source.

### setReflectionMapSource(Short value) {#setReflectionMapSource-java.lang.Short}
```java
public final void setReflectionMapSource(Short value)
```

Gets or sets the reflection map source.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The reflection map source. |

### getReflectionMapFileName() {#getReflectionMapFileName}
```java
public final String getReflectionMapFileName()
```

Gets or sets the name of the reflection map file.

**Returns:** String - The name of the reflection map file.

### setReflectionMapFileName(String value) {#setReflectionMapFileName-java.lang.String}
```java
public final void setReflectionMapFileName(String value)
```

Gets or sets the name of the reflection map file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the reflection map file. |

### getReflectionMapMapperProjectionMethod() {#getReflectionMapMapperProjectionMethod}
```java
public final Short getReflectionMapMapperProjectionMethod()
```

Gets or sets the reflection map mapper projection method.

**Returns:** Short - The reflection map mapper projection method.

### setReflectionMapMapperProjectionMethod(Short value) {#setReflectionMapMapperProjectionMethod-java.lang.Short}
```java
public final void setReflectionMapMapperProjectionMethod(Short value)
```

Gets or sets the reflection map mapper projection method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The reflection map mapper projection method. |

### getReflectionMapMapperTilingMethod() {#getReflectionMapMapperTilingMethod}
```java
public final Short getReflectionMapMapperTilingMethod()
```

Gets or sets the reflection map mapper tiling method.

**Returns:** Short - The reflection map mapper tiling method.

### setReflectionMapMapperTilingMethod(Short value) {#setReflectionMapMapperTilingMethod-java.lang.Short}
```java
public final void setReflectionMapMapperTilingMethod(Short value)
```

Gets or sets the reflection map mapper tiling method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The reflection map mapper tiling method. |

### getReflectionMapMapperAutoTransformMethod() {#getReflectionMapMapperAutoTransformMethod}
```java
public final Short getReflectionMapMapperAutoTransformMethod()
```

Gets or sets the reflection map mapper automatic transform method.

**Returns:** Short - The reflection map mapper automatic transform method.

### setReflectionMapMapperAutoTransformMethod(Short value) {#setReflectionMapMapperAutoTransformMethod-java.lang.Short}
```java
public final void setReflectionMapMapperAutoTransformMethod(Short value)
```

Gets or sets the reflection map mapper automatic transform method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The reflection map mapper automatic transform method. |

### getReflectionMapMapperTransformMatrix() {#getReflectionMapMapperTransformMatrix}
```java
public final List<Double> getReflectionMapMapperTransformMatrix()
```

Gets or sets the reflection map mapper transform matrix.

**Returns:** List<Double> - The reflection map mapper transform matrix.

### setReflectionMapMapperTransformMatrix(List<Double> value) {#setReflectionMapMapperTransformMatrix-java.util.List}
```java
public final void setReflectionMapMapperTransformMatrix(List<Double> value)
```

Gets or sets the reflection map mapper transform matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Double> | The reflection map mapper transform matrix. |

### getOpacityPercent() {#getOpacityPercent}
```java
public final Double getOpacityPercent()
```

Gets or sets the opacity percent.

**Returns:** Double - The opacity percent.

### setOpacityPercent(Double value) {#setOpacityPercent-java.lang.Double}
```java
public final void setOpacityPercent(Double value)
```

Gets or sets the opacity percent.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The opacity percent. |

### getOpacityMapBlendFactor() {#getOpacityMapBlendFactor}
```java
public final Double getOpacityMapBlendFactor()
```

Gets or sets the opacity map blend factor.

**Returns:** Double - The opacity map blend factor.

### setOpacityMapBlendFactor(Double value) {#setOpacityMapBlendFactor-java.lang.Double}
```java
public final void setOpacityMapBlendFactor(Double value)
```

Gets or sets the opacity map blend factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The opacity map blend factor. |

### getOpacityMapSource() {#getOpacityMapSource}
```java
public final Short getOpacityMapSource()
```

Gets or sets the opacity map source.

**Returns:** Short - The opacity map source.

### setOpacityMapSource(Short value) {#setOpacityMapSource-java.lang.Short}
```java
public final void setOpacityMapSource(Short value)
```

Gets or sets the opacity map source.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The opacity map source. |

### getOpacityMapFileName() {#getOpacityMapFileName}
```java
public final String getOpacityMapFileName()
```

Gets or sets the name of the opacity map file.

**Returns:** String - The name of the opacity map file.

### setOpacityMapFileName(String value) {#setOpacityMapFileName-java.lang.String}
```java
public final void setOpacityMapFileName(String value)
```

Gets or sets the name of the opacity map file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the opacity map file. |

### getOpacityMapMapperProjectionMethod() {#getOpacityMapMapperProjectionMethod}
```java
public final Short getOpacityMapMapperProjectionMethod()
```

Gets or sets the opacity map mapper projection method.

**Returns:** Short - The opacity map mapper projection method.

### setOpacityMapMapperProjectionMethod(Short value) {#setOpacityMapMapperProjectionMethod-java.lang.Short}
```java
public final void setOpacityMapMapperProjectionMethod(Short value)
```

Gets or sets the opacity map mapper projection method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The opacity map mapper projection method. |

### getOpacityMapMapperTilingMethod() {#getOpacityMapMapperTilingMethod}
```java
public final Short getOpacityMapMapperTilingMethod()
```

Gets or sets the opacity map mapper tiling method.

**Returns:** Short - The opacity map mapper tiling method.

### setOpacityMapMapperTilingMethod(Short value) {#setOpacityMapMapperTilingMethod-java.lang.Short}
```java
public final void setOpacityMapMapperTilingMethod(Short value)
```

Gets or sets the opacity map mapper tiling method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The opacity map mapper tiling method. |

### getOpacityMapMapperAutoTransformMethod() {#getOpacityMapMapperAutoTransformMethod}
```java
public final Short getOpacityMapMapperAutoTransformMethod()
```

Gets or sets the opacity map mapper automatic transform method.

**Returns:** Short - The opacity map mapper automatic transform method.

### setOpacityMapMapperAutoTransformMethod(Short value) {#setOpacityMapMapperAutoTransformMethod-java.lang.Short}
```java
public final void setOpacityMapMapperAutoTransformMethod(Short value)
```

Gets or sets the opacity map mapper automatic transform method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The opacity map mapper automatic transform method. |

### getOpacityMapMapperTransformMatrix() {#getOpacityMapMapperTransformMatrix}
```java
public final List<Double> getOpacityMapMapperTransformMatrix()
```

Gets or sets the opacity map mapper transform matrix.

**Returns:** List<Double> - The opacity map mapper transform matrix.

### setOpacityMapMapperTransformMatrix(List<Double> value) {#setOpacityMapMapperTransformMatrix-java.util.List}
```java
public final void setOpacityMapMapperTransformMatrix(List<Double> value)
```

Gets or sets the opacity map mapper transform matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Double> | The opacity map mapper transform matrix. |

### getBumpMapBlendFactor() {#getBumpMapBlendFactor}
```java
public final Double getBumpMapBlendFactor()
```

Gets or sets the bump map blend factor.

**Returns:** Double - The bump map blend factor.

### setBumpMapBlendFactor(Double value) {#setBumpMapBlendFactor-java.lang.Double}
```java
public final void setBumpMapBlendFactor(Double value)
```

Gets or sets the bump map blend factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The bump map blend factor. |

### getBumpMapSource() {#getBumpMapSource}
```java
public final Short getBumpMapSource()
```

Gets or sets the bump map source.

**Returns:** Short - The bump map source.

### setBumpMapSource(Short value) {#setBumpMapSource-java.lang.Short}
```java
public final void setBumpMapSource(Short value)
```

Gets or sets the bump map source.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The bump map source. |

### getBumpMapFileName() {#getBumpMapFileName}
```java
public final String getBumpMapFileName()
```

Gets or sets the name of the bump map file.

**Returns:** String - The name of the bump map file.

### setBumpMapFileName(String value) {#setBumpMapFileName-java.lang.String}
```java
public final void setBumpMapFileName(String value)
```

Gets or sets the name of the bump map file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the bump map file. |

### getBumpMapMapperProjectionMethod() {#getBumpMapMapperProjectionMethod}
```java
public final Short getBumpMapMapperProjectionMethod()
```

Gets or sets the bump map mapper projection method.

**Returns:** Short - The bump map mapper projection method.

### setBumpMapMapperProjectionMethod(Short value) {#setBumpMapMapperProjectionMethod-java.lang.Short}
```java
public final void setBumpMapMapperProjectionMethod(Short value)
```

Gets or sets the bump map mapper projection method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The bump map mapper projection method. |

### getBumpMapMapperTilingMethod() {#getBumpMapMapperTilingMethod}
```java
public final Short getBumpMapMapperTilingMethod()
```

Gets or sets the bump map mapper tiling method.

**Returns:** Short - The bump map mapper tiling method.

### setBumpMapMapperTilingMethod(Short value) {#setBumpMapMapperTilingMethod-java.lang.Short}
```java
public final void setBumpMapMapperTilingMethod(Short value)
```

Gets or sets the bump map mapper tiling method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The bump map mapper tiling method. |

### getBumpMapMapperAutoTransformMethod() {#getBumpMapMapperAutoTransformMethod}
```java
public final short getBumpMapMapperAutoTransformMethod()
```

Gets or sets the bump map mapper automatic transform method.

**Returns:** short - The bump map mapper automatic transform method.

### setBumpMapMapperAutoTransformMethod(short value) {#setBumpMapMapperAutoTransformMethod-short}
```java
public final void setBumpMapMapperAutoTransformMethod(short value)
```

Gets or sets the bump map mapper automatic transform method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The bump map mapper automatic transform method. |

### getBumpMapMapperTransformMatrix() {#getBumpMapMapperTransformMatrix}
```java
public final List<Double> getBumpMapMapperTransformMatrix()
```

Gets or sets the bump map mapper transform matrix.

**Returns:** List<Double> - The bump map mapper transform matrix.

### setBumpMapMapperTransformMatrix(List<Double> value) {#setBumpMapMapperTransformMatrix-java.util.List}
```java
public final void setBumpMapMapperTransformMatrix(List<Double> value)
```

Gets or sets the bump map mapper transform matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Double> | The bump map mapper transform matrix. |

### getRefractionIndex() {#getRefractionIndex}
```java
public final Double getRefractionIndex()
```

Gets or sets the index of the refraction.

**Returns:** Double - The index of the refraction.

### setRefractionIndex(Double value) {#setRefractionIndex-java.lang.Double}
```java
public final void setRefractionIndex(Double value)
```

Gets or sets the index of the refraction.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The index of the refraction. |

### getRefractionMapBlendFactor() {#getRefractionMapBlendFactor}
```java
public final Double getRefractionMapBlendFactor()
```

Gets or sets the refraction map blend factor.

**Returns:** Double - The refraction map blend factor.

### setRefractionMapBlendFactor(Double value) {#setRefractionMapBlendFactor-java.lang.Double}
```java
public final void setRefractionMapBlendFactor(Double value)
```

Gets or sets the refraction map blend factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The refraction map blend factor. |

### getRefractionMapSource() {#getRefractionMapSource}
```java
public final short getRefractionMapSource()
```

Gets or sets the refraction map source.

**Returns:** short - The refraction map source.

### setRefractionMapSource(short value) {#setRefractionMapSource-short}
```java
public final void setRefractionMapSource(short value)
```

Gets or sets the refraction map source.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The refraction map source. |

### getRefractionMapFileName() {#getRefractionMapFileName}
```java
public final String getRefractionMapFileName()
```

Gets or sets the name of the refraction map file.

**Returns:** String - The name of the refraction map file.

### setRefractionMapFileName(String value) {#setRefractionMapFileName-java.lang.String}
```java
public final void setRefractionMapFileName(String value)
```

Gets or sets the name of the refraction map file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the refraction map file. |

### getRefractionMapMapperProjectionMethod() {#getRefractionMapMapperProjectionMethod}
```java
public final Short getRefractionMapMapperProjectionMethod()
```

Gets or sets the refraction map mapper projection method.

**Returns:** Short - The refraction map mapper projection method.

### setRefractionMapMapperProjectionMethod(Short value) {#setRefractionMapMapperProjectionMethod-java.lang.Short}
```java
public final void setRefractionMapMapperProjectionMethod(Short value)
```

Gets or sets the refraction map mapper projection method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The refraction map mapper projection method. |

### getRefractionMapMapperTilingMethod() {#getRefractionMapMapperTilingMethod}
```java
public final Short getRefractionMapMapperTilingMethod()
```

Gets or sets the refraction map mapper tiling method.

**Returns:** Short - The refraction map mapper tiling method.

### setRefractionMapMapperTilingMethod(Short value) {#setRefractionMapMapperTilingMethod-java.lang.Short}
```java
public final void setRefractionMapMapperTilingMethod(Short value)
```

Gets or sets the refraction map mapper tiling method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The refraction map mapper tiling method. |

### getRefractionMapMapperAutoTransformMethod() {#getRefractionMapMapperAutoTransformMethod}
```java
public final Short getRefractionMapMapperAutoTransformMethod()
```

Gets or sets the refraction map mapper automatic transform method.

**Returns:** Short - The refraction map mapper automatic transform method.

### setRefractionMapMapperAutoTransformMethod(Short value) {#setRefractionMapMapperAutoTransformMethod-java.lang.Short}
```java
public final void setRefractionMapMapperAutoTransformMethod(Short value)
```

Gets or sets the refraction map mapper automatic transform method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The refraction map mapper automatic transform method. |

### getRefractionMapMapperTransformMatrix() {#getRefractionMapMapperTransformMatrix}
```java
public final List<Double> getRefractionMapMapperTransformMatrix()
```

Gets or sets the refraction map mapper transform matrix.

**Returns:** List<Double> - The refraction map mapper transform matrix.

### setRefractionMapMapperTransformMatrix(List<Double> value) {#setRefractionMapMapperTransformMatrix-java.util.List}
```java
public final void setRefractionMapMapperTransformMatrix(List<Double> value)
```

Gets or sets the refraction map mapper transform matrix.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<Double> | The refraction map mapper transform matrix. |

### getColorBleedScale() {#getColorBleedScale}
```java
public final Double getColorBleedScale()
```

Gets or sets the color bleed scale.

**Returns:** Double - The color bleed scale.

### setColorBleedScale(Double value) {#setColorBleedScale-java.lang.Double}
```java
public final void setColorBleedScale(Double value)
```

Gets or sets the color bleed scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The color bleed scale. |

### getIndirectDumpScale() {#getIndirectDumpScale}
```java
public final Double getIndirectDumpScale()
```

Gets or sets the indirect dump scale.

**Returns:** Double - The indirect dump scale.

### setIndirectDumpScale(Double value) {#setIndirectDumpScale-java.lang.Double}
```java
public final void setIndirectDumpScale(Double value)
```

Gets or sets the indirect dump scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The indirect dump scale. |

### getReflectanceScale() {#getReflectanceScale}
```java
public final Double getReflectanceScale()
```

Gets or sets the reflectance scale.

**Returns:** Double - The reflectance scale.

### setReflectanceScale(Double value) {#setReflectanceScale-java.lang.Double}
```java
public final void setReflectanceScale(Double value)
```

Gets or sets the reflectance scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The reflectance scale. |

### getTransmittanceScale() {#getTransmittanceScale}
```java
public final Double getTransmittanceScale()
```

Gets or sets the transmittance scale.

**Returns:** Double - The transmittance scale.

### setTransmittanceScale(Double value) {#setTransmittanceScale-java.lang.Double}
```java
public final void setTransmittanceScale(Double value)
```

Gets or sets the transmittance scale.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The transmittance scale. |

### getTwoSidedMaterial() {#getTwoSidedMaterial}
```java
public final Boolean getTwoSidedMaterial()
```

Gets or sets the two sided material.

**Returns:** Boolean - The two sided material.

### setTwoSidedMaterial(Boolean value) {#setTwoSidedMaterial-java.lang.Boolean}
```java
public final void setTwoSidedMaterial(Boolean value)
```

Gets or sets the two sided material.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Boolean | The two sided material. |

### getLuminance() {#getLuminance}
```java
public final Double getLuminance()
```

Gets or sets the luminance.

**Returns:** Double - The luminance.

### setLuminance(Double value) {#setLuminance-java.lang.Double}
```java
public final void setLuminance(Double value)
```

Gets or sets the luminance.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The luminance. |

### getLuminanceMode() {#getLuminanceMode}
```java
public final Short getLuminanceMode()
```

Gets or sets the luminance mode.

**Returns:** Short - The luminance mode.

### setLuminanceMode(Short value) {#setLuminanceMode-java.lang.Short}
```java
public final void setLuminanceMode(Short value)
```

Gets or sets the luminance mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The luminance mode. |

### getNormalMapMethod() {#getNormalMapMethod}
```java
public final Short getNormalMapMethod()
```

Gets or sets the normal map method.

**Returns:** Short - The normal map method.

### setNormalMapMethod(Short value) {#setNormalMapMethod-java.lang.Short}
```java
public final void setNormalMapMethod(Short value)
```

Gets or sets the normal map method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The normal map method. |

### getNormalMapStrength() {#getNormalMapStrength}
```java
public final Double getNormalMapStrength()
```

Gets or sets the normal map strength.

**Returns:** Double - The normal map strength.

### setNormalMapStrength(Double value) {#setNormalMapStrength-java.lang.Double}
```java
public final void setNormalMapStrength(Double value)
```

Gets or sets the normal map strength.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The normal map strength. |

### getNormalMapBlendFactor() {#getNormalMapBlendFactor}
```java
public final Double getNormalMapBlendFactor()
```

Gets or sets the normal map blend factor.

**Returns:** Double - The normal map blend factor.

### setNormalMapBlendFactor(Double value) {#setNormalMapBlendFactor-java.lang.Double}
```java
public final void setNormalMapBlendFactor(Double value)
```

Gets or sets the normal map blend factor.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The normal map blend factor. |

### getNormalMapSource() {#getNormalMapSource}
```java
public final Short getNormalMapSource()
```

Gets or sets the normal map source.

**Returns:** Short - The normal map source.

### setNormalMapSource(Short value) {#setNormalMapSource-java.lang.Short}
```java
public final void setNormalMapSource(Short value)
```

Gets or sets the normal map source.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The normal map source. |

### getNormalMapSourceFileName() {#getNormalMapSourceFileName}
```java
public final String getNormalMapSourceFileName()
```

Gets or sets the name of the normal map source file.

**Returns:** String - The name of the normal map source file.

### setNormalMapSourceFileName(String value) {#setNormalMapSourceFileName-java.lang.String}
```java
public final void setNormalMapSourceFileName(String value)
```

Gets or sets the name of the normal map source file.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the normal map source file. |

### getNormalMapperProjection() {#getNormalMapperProjection}
```java
public final Short getNormalMapperProjection()
```

Gets or sets the normal mapper projection.

**Returns:** Short - The normal mapper projection.

### setNormalMapperProjection(Short value) {#setNormalMapperProjection-java.lang.Short}
```java
public final void setNormalMapperProjection(Short value)
```

Gets or sets the normal mapper projection.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The normal mapper projection. |

### getNormalMapperTiling() {#getNormalMapperTiling}
```java
public final Short getNormalMapperTiling()
```

Gets or sets the normal mapper tiling.

**Returns:** Short - The normal mapper tiling.

### setNormalMapperTiling(Short value) {#setNormalMapperTiling-java.lang.Short}
```java
public final void setNormalMapperTiling(Short value)
```

Gets or sets the normal mapper tiling.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The normal mapper tiling. |

### getNormalMapperAutoTransform() {#getNormalMapperAutoTransform}
```java
public final Short getNormalMapperAutoTransform()
```

Gets or sets the normal mapper automatic transform.

**Returns:** Short - The normal mapper automatic transform.

### setNormalMapperAutoTransform(Short value) {#setNormalMapperAutoTransform-java.lang.Short}
```java
public final void setNormalMapperAutoTransform(Short value)
```

Gets or sets the normal mapper automatic transform.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The normal mapper automatic transform. |

### getNormalMapperTransform() {#getNormalMapperTransform}
```java
public final Double getNormalMapperTransform()
```

Gets or sets the normal mapper transform.

**Returns:** Double - The normal mapper transform.

### setNormalMapperTransform(Double value) {#setNormalMapperTransform-java.lang.Double}
```java
public final void setNormalMapperTransform(Double value)
```

Gets or sets the normal mapper transform.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The normal mapper transform. |

### getMaterialsAnonymous() {#getMaterialsAnonymous}
```java
public final Boolean getMaterialsAnonymous()
```

Gets or sets the materials anonymous.

**Returns:** Boolean - The materials anonymous.

### setMaterialsAnonymous(Boolean value) {#setMaterialsAnonymous-java.lang.Boolean}
```java
public final void setMaterialsAnonymous(Boolean value)
```

Gets or sets the materials anonymous.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Boolean | The materials anonymous. |

### getGlobalIlluminationMode() {#getGlobalIlluminationMode}
```java
public final Short getGlobalIlluminationMode()
```

Gets or sets the global illumination mode.

**Returns:** Short - The global illumination mode.

### setGlobalIlluminationMode(Short value) {#setGlobalIlluminationMode-java.lang.Short}
```java
public final void setGlobalIlluminationMode(Short value)
```

Gets or sets the global illumination mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The global illumination mode. |

### getFinalGatherMode() {#getFinalGatherMode}
```java
public final Short getFinalGatherMode()
```

Gets or sets the final gather mode.

**Returns:** Short - The final gather mode.

### setFinalGatherMode(Short value) {#setFinalGatherMode-java.lang.Short}
```java
public final void setFinalGatherMode(Short value)
```

Gets or sets the final gather mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The final gather mode. |

### getGenProcName() {#getGenProcName}
```java
public final String getGenProcName()
```

Gets or sets the name of the gen proc.

**Returns:** String - The name of the gen proc.

### setGenProcName(String value) {#setGenProcName-java.lang.String}
```java
public final void setGenProcName(String value)
```

Gets or sets the name of the gen proc.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the gen proc. |

### getGenProcValBool() {#getGenProcValBool}
```java
public final Boolean getGenProcValBool()
```

Gets or sets the gen proc value bool.

**Returns:** Boolean - The gen proc value bool.

### setGenProcValBool(Boolean value) {#setGenProcValBool-java.lang.Boolean}
```java
public final void setGenProcValBool(Boolean value)
```

Gets or sets the gen proc value bool.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Boolean | The gen proc value bool. |

### getGenProcValInt() {#getGenProcValInt}
```java
public final Short getGenProcValInt()
```

Gets or sets the gen proc value int.

**Returns:** Short - The gen proc value int.

### setGenProcValInt(Short value) {#setGenProcValInt-java.lang.Short}
```java
public final void setGenProcValInt(Short value)
```

Gets or sets the gen proc value int.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The gen proc value int. |

### getGenProcValReal() {#getGenProcValReal}
```java
public final Double getGenProcValReal()
```

Gets or sets the gen proc value real.

**Returns:** Double - The gen proc value real.

### setGenProcValReal(Double value) {#setGenProcValReal-java.lang.Double}
```java
public final void setGenProcValReal(Double value)
```

Gets or sets the gen proc value real.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The gen proc value real. |

### getGenProcValText() {#getGenProcValText}
```java
public final String getGenProcValText()
```

Gets or sets the gen proc value text.

**Returns:** String - The gen proc value text.

### setGenProcValText(String value) {#setGenProcValText-java.lang.String}
```java
public final void setGenProcValText(String value)
```

Gets or sets the gen proc value text.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The gen proc value text. |

### getGenProcTableEnd() {#getGenProcTableEnd}
```java
public final Boolean getGenProcTableEnd()
```

Gets or sets the gen proc table end.

**Returns:** Boolean - The gen proc table end.

### setGenProcTableEnd(Boolean value) {#setGenProcTableEnd-java.lang.Boolean}
```java
public final void setGenProcTableEnd(Boolean value)
```

Gets or sets the gen proc table end.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Boolean | The gen proc table end. |

### getGenProcValColorIndex() {#getGenProcValColorIndex}
```java
public final Integer getGenProcValColorIndex()
```

Gets or sets the index of the gen proc value color.

**Returns:** Integer - The index of the gen proc value color.

### setGenProcValColorIndex(Integer value) {#setGenProcValColorIndex-java.lang.Integer}
```java
public final void setGenProcValColorIndex(Integer value)
```

Gets or sets the index of the gen proc value color.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Integer | The index of the gen proc value color. |

### getGenProcValColorRGB() {#getGenProcValColorRGB}
```java
public final Integer getGenProcValColorRGB()
```

Gets or sets the gen proc value color RGB.

**Returns:** Integer - The gen proc value color RGB.

### setGenProcValColorRGB(Integer value) {#setGenProcValColorRGB-java.lang.Integer}
```java
public final void setGenProcValColorRGB(Integer value)
```

Gets or sets the gen proc value color RGB.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Integer | The gen proc value color RGB. |

### getGenProcValColorName() {#getGenProcValColorName}
```java
public final String getGenProcValColorName()
```

Gets or sets the name of the gen proc value color.

**Returns:** String - The name of the gen proc value color.

### setGenProcValColorName(String value) {#setGenProcValColorName-java.lang.String}
```java
public final void setGenProcValColorName(String value)
```

Gets or sets the name of the gen proc value color.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the gen proc value color. |

### getMapUTile() {#getMapUTile}
```java
public final Short getMapUTile()
```

Gets or sets the map u tile.

**Returns:** Short - The map u tile.

### setMapUTile(Short value) {#setMapUTile-java.lang.Short}
```java
public final void setMapUTile(Short value)
```

Gets or sets the map u tile.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The map u tile. |

### getTranslucence() {#getTranslucence}
```java
public final Double getTranslucence()
```

Gets or sets the translucence.

**Returns:** Double - The translucence.

### setTranslucence(Double value) {#setTranslucence-java.lang.Double}
```java
public final void setTranslucence(Double value)
```

Gets or sets the translucence.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The translucence. |

### getSelfIlluminaton() {#getSelfIlluminaton}
```java
public final Integer getSelfIlluminaton()
```

Gets or sets the self illuminaton.

**Returns:** Integer - The self illuminaton.

### setSelfIlluminaton(Integer value) {#setSelfIlluminaton-java.lang.Integer}
```java
public final void setSelfIlluminaton(Integer value)
```

Gets or sets the self illuminaton.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Integer | The self illuminaton. |

### getReflectivity() {#getReflectivity}
```java
public final Double getReflectivity()
```

Gets or sets the reflectivity.

**Returns:** Double - The reflectivity.

### setReflectivity(Double value) {#setReflectivity-java.lang.Double}
```java
public final void setReflectivity(Double value)
```

Gets or sets the reflectivity.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Double | The reflectivity. |

### getIlluminationModel() {#getIlluminationModel}
```java
public final Integer getIlluminationModel()
```

Gets or sets the illumination model.

**Returns:** Integer - The illumination model.

### setIlluminationModel(Integer value) {#setIlluminationModel-java.lang.Integer}
```java
public final void setIlluminationModel(Integer value)
```

Gets or sets the illumination model.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Integer | The illumination model. |

### getChannelFlags() {#getChannelFlags}
```java
public final Integer getChannelFlags()
```

Gets or sets the channel flags.

**Returns:** Integer - The channel flags.

### setChannelFlags(Integer value) {#setChannelFlags-java.lang.Integer}
```java
public final void setChannelFlags(Integer value)
```

Gets or sets the channel flags.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Integer | The channel flags. |

### getAttribute282() {#getAttribute282}
```java
public final Short getAttribute282()
```

Gets or sets the 282 attribute.

**Returns:** Short - The 282 attribute.

### setAttribute282(Short value) {#setAttribute282-java.lang.Short}
```java
public final void setAttribute282(Short value)
```

Gets or sets the 282 attribute.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Short | The 282 attribute. |

