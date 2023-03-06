---
title: Class FeaturesSequence
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.FeaturesSequence clase. FeaturesSequence representa un conjunto de características vectoriales.
type: docs
weight: 170
url: /es/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` representa un conjunto de características vectoriales.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Obtiene la colección de atributos personalizados para las funciones en este[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Obtiene el sistema de referencia espacial de esta secuencia de entidades. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Devuelve un enumerador que itera a través de la colección. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Obtiene una extensión espacial de esta capa. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Guarda la secuencia de características en la capa. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Guarda la secuencia de características en la capa. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Guarda la secuencia de características en la capa. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Guarda la secuencia de características en la capa. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Dividir entidades por tipo de geometría. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Selecciona entidades con un valor de atributo igual al valor proporcionado. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Selecciona entidades con un valor de atributo mayor que el valor proporcionado. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Selecciona entidades con valor de atributo mayor o igual al valor proporcionado. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Filtra entidades según la extensión. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Filtra entidades en función de la unión de todas las geometrías en otra secuencia de entidades. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Filtra entidades según la geometría proporcionada. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Selecciona entidades con un valor de atributo que no es igual al valor proporcionado. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Selecciona entidades con atributo distinto de nulo. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Selecciona entidades con atributo igual a nulo. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Selecciona entidades con conjunto de atributos. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Selecciona entidades con un valor de atributo menor que el valor proporcionado. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Selecciona entidades con valor de atributo menor o igual al valor proporcionado. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Selecciona entidades donde el atributo especificado no está establecido. |

### Ver también

* class [Feature](../feature/)
* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


