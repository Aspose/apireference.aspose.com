---
title: Class VectorLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.VectorLayer clase. Representa una capa vectorial. Una capa vectorial es una colección de características geográficas almacenadas en un archivo.
type: docs
weight: 2320
url: /es/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Representa una capa vectorial. Una capa vectorial es una colección de características geográficas almacenadas en un archivo.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Obtiene la colección de atributos personalizados para las funciones en este`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Obtiene el número de entidades en esta capa. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Obtiene el[`Driver`](./driver/) que instancia esta capa. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Obtiene el tipo de geometría de la capa. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Obtiene el[`Feature`](../feature/) en el índice especificado. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Obtiene el sistema de referencia espacial de esta secuencia de entidades. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Crea la capa y la abre para agregar nuevas características. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Crea la capa y la abre para agregar nuevas características. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Crea la capa y la abre para agregar nuevas características. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Crea la capa y la abre para agregar nuevas características. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Abre la capa para lectura. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Abre la capa para lectura. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Abre la capa para lectura. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Abre la capa para lectura. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | Agrega una nueva entidad a la capa, si es compatible con el`VectorLayer` s[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | Agrega una nueva entidad con el estilo especificado a la capa, si es compatible con el`VectorLayer` s[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | Crear un clon de capa como formato InMemory. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Crea (pero no agrega a la capa) una nueva entidad con atributos que coinciden con la colección de atributos de esta capa. Cuando termine de configurar los datos para la entidad, use[`Add`](./add/) para agregar la entidad a la capa. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Copia atributos de otros`VectorLayer` a este. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Copia atributos de otros`VectorLayer` a este. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | Libera los recursos utilizados por el`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Determina si el objeto especificado es igual al objeto actual. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Devuelve un enumerador que itera a través de la colección. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Obtiene una extensión espacial de esta capa. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Une una capa a la capa actual. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Obtiene la entidad más cercana al punto proporcionado. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Obtiene la entidad más cercana a la coordenada proporcionada. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Eliminar el[`Feature`](../feature/) en el índice especificado. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Reemplace el[`Feature`](../feature/) en el índice especificado. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Guarda la secuencia de características en la capa. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Guarda la secuencia de características en la capa. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Guarda la secuencia de características en la capa. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Guarda la secuencia de características en la capa. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Dividir entidades por tipo de geometría. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | Carga el índice de atributo para acelerar el filtrado por valor de atributo en métodos de filtro como[`WhereGreater`](../featuressequence/wheregreater/). Si el índice no existe lo crea primero. Usar*forceRebuild* para forzar el índice de recreación. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | Carga el índice de atributo para acelerar el filtrado por valor de atributo en métodos de filtro como[`WhereGreater`](../featuressequence/wheregreater/). Si el índice no existe lo crea primero. Usar*forceRebuild* para forzar el índice de recreación. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | Carga el índice espacial para acelerar el filtrado por valor de atributos en métodos de filtrado como[`WhereIntersects`](../featuressequence/whereintersects/) y[`NearestTo`](./nearestto/). Si el índice no existe lo crea primero. Usar*forceRebuild* para forzar el índice de recreación. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | Carga el índice espacial para acelerar el filtrado por valor de atributos en métodos de filtrado como[`WhereIntersects`](../featuressequence/whereintersects/) y[`NearestTo`](./nearestto/). Si el índice no existe lo crea primero. Usar*forceRebuild* para forzar el índice de recreación. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Selecciona entidades con un valor de atributo igual al valor proporcionado. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Selecciona entidades con un valor de atributo mayor que el valor proporcionado. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Selecciona entidades con valor de atributo mayor o igual al valor proporcionado. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Filtra entidades según la extensión. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Filtra entidades en función de la unión de todas las geometrías en otra secuencia de entidades. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Filtra entidades según la geometría proporcionada. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Selecciona entidades con un valor de atributo que no es igual al valor proporcionado. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Selecciona entidades con atributo distinto de nulo. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Selecciona entidades con atributo igual a nulo. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Selecciona entidades con conjunto de atributos. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Selecciona entidades con un valor de atributo menor que el valor proporcionado. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Selecciona entidades con valor de atributo menor o igual al valor proporcionado. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Selecciona entidades donde el atributo especificado no está establecido. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Convierte una capa a un formato diferente. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Convierte una capa a un formato diferente. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Convierte una capa a un formato diferente. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Convierte una capa a un formato diferente. |

### Ver también

* class [FeaturesSequence](../featuressequence/)
* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


