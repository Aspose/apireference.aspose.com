---
title: Class Feature
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Feature clase. Una característica geográfica compuesta por una geometría y atributos definidos por el usuario.
type: docs
weight: 130
url: /es/net/aspose.gis/feature/
---
## Feature class

Una característica geográfica compuesta por una geometría y atributos definidos por el usuario.

```csharp
public class Feature
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Obtiene o establece la geometría de la entidad. No se puede`null` , usar[`Null`](../../aspose.gis.geometries/geometry/null/) para indicar geometría faltante. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Copia valores de atributos de otra característica. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Obtiene el valor de un atributo. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Obtiene el valor de un atributo. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Obtiene el valor de un atributo, o[`DefaultValue`](../featureattribute/defaultvalue/) si el valor no está configurado o`nulo` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Obtiene el valor de un atributo, o[`DefaultValue`](../featureattribute/defaultvalue/) si el valor no está configurado o`nulo` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Obtiene el valor de un atributo, o[`DefaultValue`](../featureattribute/defaultvalue/) si el valor no está configurado o`nulo` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Devuelve los valores de todos los atributos de una matriz. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Devuelve los valores de todos los atributos de una matriz. Considere usar[`GetValues`](./getvalues/) método para evitar la asignación de memoria adicional. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | Obtiene los valores de una secuencia de atributos en forma de lista. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Determina si el atributo especificado se ha establecido explícitamente en`nulo` valor. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Comprueba si el valor del atributo está establecido en esta característica. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Establece un nuevo valor de un atributo. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Establece el valor del atributo en`nulo` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Establece nuevos valores para todos los atributos. También considere usar[`CopyValues`](./copyvalues/) método para agilizar la configuración de valores en una llamada. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Elimina el valor del atributo de esta característica. |

### Ver también

* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


