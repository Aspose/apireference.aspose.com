---
title: VectorLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: Stellt eine Vektorebene dar. Eine Vektorebene ist eine Sammlung geografischer Merkmale die in einer Datei gespeichert sind.
type: docs
weight: 2220
url: /de/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Stellt eine Vektorebene dar. Eine Vektorebene ist eine Sammlung geografischer Merkmale, die in einer Datei gespeichert sind.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes) { get; } | Ruft die Sammlung von benutzerdefinierten Attributen für Features in this ab[`VectorLayer`](../vectorlayer) . |
| virtual [Count](../../aspose.gis/vectorlayer/count) { get; } | Ruft die Anzahl der Features in diesem Layer ab. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver) { get; } | Ruft die ab[`Driver`](./driver) die diese Ebene instanziiert hat. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype) { get; } | Ruft den Typ der Geometrie für die Ebene ab. |
| virtual [Item](../../aspose.gis/vectorlayer/item) { get; } | Ruft die ab[`Feature`](../feature) am angegebenen Index. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem) { get; } | Ruft das räumliche Bezugssystem dieser Feature-Sequenz ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create#create)(AbstractPath, FileDriver) | Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features. |
| static [Create](../../aspose.gis/vectorlayer/create#create_4)(string, FileDriver) | Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features. |
| static [Create](../../aspose.gis/vectorlayer/create#create_1)(AbstractPath, FileDriver, DriverOptions) | Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features. |
| static [Create](../../aspose.gis/vectorlayer/create#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| static [Create](../../aspose.gis/vectorlayer/create#create_5)(string, FileDriver, DriverOptions) | Erstellt den Layer und öffnet ihn zum Hinzufügen neuer Features. |
| static [Create](../../aspose.gis/vectorlayer/create#create_7)(string, FileDriver, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| static [Create](../../aspose.gis/vectorlayer/create#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| static [Create](../../aspose.gis/vectorlayer/create#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| static [Open](../../aspose.gis/vectorlayer/open#open)(AbstractPath, FileDriver) | Ebene zum Lesen öffnen. |
| static [Open](../../aspose.gis/vectorlayer/open#open_2)(string, FileDriver) | Ebene zum Lesen öffnen. |
| static [Open](../../aspose.gis/vectorlayer/open#open_1)(AbstractPath, FileDriver, DriverOptions) | Ebene zum Lesen öffnen. |
| static [Open](../../aspose.gis/vectorlayer/open#open_3)(string, FileDriver, DriverOptions) | Ebene zum Lesen öffnen. |
| [Add](../../aspose.gis/vectorlayer/add#add)(Feature) | Fügt dem Layer ein neues Feature hinzu, falls vom unterstützt[`VectorLayer`](../vectorlayer) s[`Driver`](./driver) . |
| virtual [Add](../../aspose.gis/vectorlayer/add#add_1)(Feature, IFeatureStyle) | Fügt dem Layer ein neues Feature mit dem angegebenen Stil hinzu, sofern vom unterstützt[`VectorLayer`](../vectorlayer) s[`Driver`](./driver) . |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature)() | Erstellt ein neues Feature (fügt es jedoch nicht zum Layer hinzu) mit Attributen, die der Sammlung von Attributen dieses Layers entsprechen. Wenn Sie mit dem Festlegen von Daten für das Feature fertig sind, verwenden Sie[`Add`](./add) um das Feature zum Layer hinzuzufügen. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes)(FeaturesSequence) | Kopiert Attribute von other[`VectorLayer`](../vectorlayer) zu diesem. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Kopiert Attribute von other[`VectorLayer`](../vectorlayer) zu diesem. |
| [Dispose](../../aspose.gis/vectorlayer/dispose)() | Gibt die Ressourcen frei, die von verwendet werden[`VectorLayer`](../vectorlayer) . |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator)() | Gibt einen Enumerator zurück, der die Sammlung durchläuft. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent)() | Ruft eine räumliche Ausdehnung dieser Ebene ab. |
| [Join](../../aspose.gis/vectorlayer/join)(VectorLayer, JoinOptions) | Verbindet eine Ebene mit der aktuellen Ebene. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto)(IPoint) | Ruft das Feature ab, das dem angegebenen Punkt am nächsten liegt. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto_1)(double, double) | Ruft das Feature ab, das der angegebenen Koordinate am nächsten liegt. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat)(int) | Entfernen Sie die[`Feature`](../feature) am angegebenen Index. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat)(int, Feature) | Ersetzen Sie die[`Feature`](../feature) am angegebenen Index. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver) | Speichert die Feature-Sequenz im Layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver) | Speichert die Feature-Sequenz im Layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver, SavingOptions) | Speichert die Feature-Sequenz im Layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver, SavingOptions) | Speichert die Feature-Sequenz im Layer. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex)(AbstractPath, string, bool) | Lädt den Attributindex, um das Filtern nach Attributwerten in Filtermethoden wie z[`WhereGreater`](../featuressequence/wheregreater). Wenn der Index nicht existiert, wird er zuerst erstellt. Verwenden*forceRebuild* um die Neuerstellung des Index zu erzwingen. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex_1)(string, string, bool) | Lädt den Attributindex, um das Filtern nach Attributwerten in Filtermethoden wie z[`WhereGreater`](../featuressequence/wheregreater). Wenn der Index nicht existiert, wird er zuerst erstellt. Verwenden*forceRebuild* um die Neuerstellung des Index zu erzwingen. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex)(AbstractPath, bool) | Lädt den räumlichen Index, um das Filtern nach Attributwerten in Filtermethoden wie z[`WhereIntersects`](../featuressequence/whereintersects) und[`NearestTo`](./nearestto). Wenn der Index nicht existiert, wird er zuerst erstellt. Verwenden*forceRebuild* um die Neuerstellung des Index zu erzwingen. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex_1)(string, bool) | Lädt den räumlichen Index, um das Filtern nach Attributwerten in Filtermethoden wie z[`WhereIntersects`](../featuressequence/whereintersects) und[`NearestTo`](./nearestto). Wenn der Index nicht existiert, wird er zuerst erstellt. Verwenden*forceRebuild* um die Neuerstellung des Index zu erzwingen. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal)(string, T) | Wählt Features aus, deren Attributwert gleich dem angegebenen Wert ist. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater)(string, T) | Wählt Features aus, deren Attributwert größer als der angegebene Wert ist. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal)(string, T) | Wählt Features aus, deren Attributwert größer oder gleich dem angegebenen Wert ist. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(Extent) | Filtert Features basierend auf der Ausdehnung. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(FeaturesSequence) | Filtert Features basierend auf der Vereinigung aller Geometrien in einer anderen Feature-Sequenz. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(IGeometry) | Filtert Features basierend auf der bereitgestellten Geometrie. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal)(string, T) | Wählt Features aus, deren Attributwert nicht dem angegebenen Wert entspricht. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull)(string) | Wählt Features mit Attribut ungleich null aus. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull)(string) | Wählt Features mit einem Attribut gleich null aus. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset)(string) | Wählt Features mit festgelegtem Attribut aus. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller)(string, T) | Wählt Features aus, deren Attributwert kleiner als der angegebene Wert ist. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal)(string, T) | Wählt Features aus, deren Attributwert kleiner oder gleich dem angegebenen Wert ist. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset)(string) | Wählt Features aus, bei denen das angegebene Attribut nicht festgelegt ist. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Konvertieren Sie eine Ebene in ein anderes Format. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_2)(string, FileDriver, string, FileDriver) | Konvertieren Sie eine Ebene in ein anderes Format. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Konvertieren Sie eine Ebene in ein anderes Format. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Konvertieren Sie eine Ebene in ein anderes Format. |

### Siehe auch

* class [FeaturesSequence](../featuressequence)
* namensraum [Aspose.Gis](../../aspose.gis)
* Montage [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
