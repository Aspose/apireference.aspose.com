---
title: Class VectorLayer
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.VectorLayer klass. Representerar ett vektorlager. Ett vektorlager är en samling geografiska egenskaper som lagras i en fil.
type: docs
weight: 2320
url: /sv/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Representerar ett vektorlager. Ett vektorlager är en samling geografiska egenskaper som lagras i en fil.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Får samlingen av anpassade attribut för funktioner i detta`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Hämtar antalet funktioner i detta lager. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Får[`Driver`](./driver/) som instansierade det här lagret. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Hämtar typen av geometri för lagret. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Får[`Feature`](../feature/) vid angivet index. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Hämtar rumsligt referenssystem för denna funktionssekvens. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Skapar lagret och öppnar det för att lägga till nya funktioner. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Skapar lagret och öppnar det för att lägga till nya funktioner. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Skapar lagret och öppnar det för att lägga till nya funktioner. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Skapar lagret och öppnar det för att lägga till nya funktioner. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Öppna lagret för läsning. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Öppna lagret för läsning. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Öppna lagret för läsning. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Öppna lagret för läsning. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | Lägger till en ny funktion i lagret, om det stöds av`VectorLayer` s[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | Lägger till en ny funktion med den angivna stilen till lagret, om det stöds av`VectorLayer` s[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | Skapa en lagerklon som InMemory-format. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Skapar (men lägger inte till i lagret) en ny funktion med attribut som matchar samlingen av attribut för detta lager. När du är klar med att ställa in data för funktionen, använd[`Add`](./add/) för att lägga till funktionen i lagret. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Kopierar attribut för andra`VectorLayer` till den här. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Kopierar attribut för andra`VectorLayer` till den här. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | Frigör resurserna som används av`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Bestämmer om det angivna objektet är lika med det aktuella objektet. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Returnerar en uppräkning som itererar genom samlingen. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Får en rumslig utsträckning av detta lager. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Sammanfogar ett lager med det aktuella lagret. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Får den funktion som ligger närmast den angivna punkten. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Får den funktion som ligger närmast den angivna koordinaten. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Ta bort[`Feature`](../feature/) vid angivet index. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Byt ut[`Feature`](../feature/) vid angivet index. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Sparar funktioner sekvens till lager. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Sparar funktioner sekvens till lager. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Sparar funktioner sekvens till lager. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Sparar funktioner sekvens till lager. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Dela upp funktioner efter geometrityp. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | Laddar attributindex för att påskynda filtrering efter attributvärde i filtermetoder som[`WhereGreater`](../featuressequence/wheregreater/). Om index inte finns skapas det först. Använda sig av*forceRebuild* för att tvinga fram indexåtergivning. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | Laddar attributindex för att påskynda filtrering efter attributvärde i filtermetoder som[`WhereGreater`](../featuressequence/wheregreater/). Om index inte finns skapas det först. Använda sig av*forceRebuild* för att tvinga fram indexåtergivning. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | Laddar rumsligt index för att påskynda filtrering efter attributvärde i filtermetoder som[`WhereIntersects`](../featuressequence/whereintersects/) och[`NearestTo`](./nearestto/). Om index inte finns skapas det först. Använda sig av*forceRebuild* för att tvinga fram indexåtergivning. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | Laddar rumsligt index för att påskynda filtrering efter attributvärde i filtermetoder som[`WhereIntersects`](../featuressequence/whereintersects/) och[`NearestTo`](./nearestto/). Om index inte finns skapas det först. Använda sig av*forceRebuild* för att tvinga fram indexåtergivning. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Väljer funktioner med attributvärde lika med det angivna värdet. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Väljer funktioner med ett attributvärde som är större än det angivna värdet. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Väljer funktioner med ett attributvärde som är större eller lika med det angivna värdet. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Filtrerar funktioner baserat på omfattningen. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Filtrerar funktioner baserat på föreningen av alla geometrier i andra funktioners sekvens. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Filtrerar funktioner baserat på den tillhandahållna geometrin. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Väljer funktioner med ett attributvärde som inte är lika med det angivna värdet. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Väljer funktioner med attribut som inte är lika med null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Väljer funktioner med attribut lika med null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Väljer funktioner med attributuppsättning. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Väljer funktioner med ett attributvärde som är mindre än det angivna värdet. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Väljer funktioner med ett attributvärde som är mindre eller lika med det angivna värdet. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Väljer funktioner där specificerat attribut inte är inställt. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Konvertera ett lager till ett annat format. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Konvertera ett lager till ett annat format. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Konvertera ett lager till ett annat format. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Konvertera ett lager till ett annat format. |

### Se även

* class [FeaturesSequence](../featuressequence/)
* namnutrymme [Aspose.Gis](../../aspose.gis/)
* hopsättning [Aspose.GIS](../../)


