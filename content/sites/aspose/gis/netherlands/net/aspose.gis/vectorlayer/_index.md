---
title: Class VectorLayer
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.VectorLayer klas. Vertegenwoordigt een vectorlaag. Een vectorlaag is een verzameling geografische kenmerken opgeslagen in een bestand.
type: docs
weight: 2320
url: /nl/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Vertegenwoordigt een vectorlaag. Een vectorlaag is een verzameling geografische kenmerken, opgeslagen in een bestand.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Haalt de verzameling aangepaste attributen op voor objecten hierin`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Krijgt het aantal objecten in deze laag. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Krijgt de[`Driver`](./driver/) die deze laag heeft geïnstantieerd. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Haalt het type geometrie voor de laag op. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Krijgt de[`Feature`](../feature/) op de opgegeven index. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Krijgt een ruimtelijk referentiesysteem van deze kenmerkenreeks. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Maakt de laag aan en opent deze om nieuwe objecten toe te voegen. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Maakt de laag aan en opent deze om nieuwe objecten toe te voegen. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Maakt de laag aan en opent deze om nieuwe objecten toe te voegen. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Maakt de laag aan en opent deze om nieuwe objecten toe te voegen. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Open de laag om te lezen. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Open de laag om te lezen. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Open de laag om te lezen. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Open de laag om te lezen. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | Voegt een nieuw object toe aan de laag, indien ondersteund door de`VectorLayer` S[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | Voegt een nieuw object met de gespecificeerde stijl toe aan de laag, indien ondersteund door de`VectorLayer` S[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | Maak een laagkloon in de InMemory-indeling. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Creëert (maar voegt niets toe aan de laag) een nieuw object met attributen die overeenkomen met de verzameling attributen van deze laag. Wanneer u klaar bent met het instellen van gegevens voor het object, gebruikt u[`Add`](./add/) om het object aan de laag toe te voegen. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Kopieert attributen van andere`VectorLayer` naar deze. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Kopieert attributen van andere`VectorLayer` naar deze. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | Geeft de bronnen vrij die worden gebruikt door de`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Bepaalt of het opgegeven object gelijk is aan het huidige object. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Retourneert een enumerator die de verzameling herhaalt. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Krijgt een ruimtelijke omvang van deze laag. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Voegt een laag toe aan de huidige laag. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Haalt het object op dat het dichtst bij het opgegeven punt ligt. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Haalt het object op dat het dichtst bij de opgegeven coördinaat ligt. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Verwijder de[`Feature`](../feature/) op de opgegeven index. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Vervang de[`Feature`](../feature/) op de opgegeven index. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Slaat de volgorde van objecten op naar laag. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Slaat de volgorde van objecten op naar laag. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Slaat de volgorde van objecten op naar laag. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Slaat de volgorde van objecten op naar laag. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Objecten splitsen op type geometrie. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | Laadt attribuutindex om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereGreater`](../featuressequence/wheregreater/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | Laadt attribuutindex om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereGreater`](../featuressequence/wheregreater/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | Laadt ruimtelijke index om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereIntersects`](../featuressequence/whereintersects/) en[`NearestTo`](./nearestto/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | Laadt ruimtelijke index om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereIntersects`](../featuressequence/whereintersects/) en[`NearestTo`](./nearestto/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Selecteert objecten met een attribuutwaarde die gelijk is aan de opgegeven waarde. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Selecteert objecten met een attribuutwaarde die groter is dan de opgegeven waarde. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Selecteert objecten met een attribuutwaarde die groter of gelijk is aan de opgegeven waarde. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Filtert functies op basis van de omvang. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Filtert objecten op basis van de vereniging van alle geometrieën in andere volgorde van objecten. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Filtert objecten op basis van de geleverde geometrie. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Selecteert objecten met een attribuutwaarde die niet gelijk is aan de opgegeven waarde. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Selecteert objecten met attribuut niet gelijk aan null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Selecteert objecten met attribuut gelijk aan null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Selecteert objecten met attribuutset. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Selecteert objecten met een attribuutwaarde die kleiner is dan de opgegeven waarde. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Selecteert objecten met een attribuutwaarde die kleiner of gelijk is aan de opgegeven waarde. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Selecteert objecten waar het gespecificeerde attribuut niet is ingesteld. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Converteer een laag naar een ander formaat. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Converteer een laag naar een ander formaat. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Converteer een laag naar een ander formaat. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Converteer een laag naar een ander formaat. |

### Zie ook

* class [FeaturesSequence](../featuressequence/)
* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


