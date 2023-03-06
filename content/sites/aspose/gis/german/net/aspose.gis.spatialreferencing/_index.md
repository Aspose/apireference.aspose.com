---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing namespace stellt Klassen für die Arbeit mit räumlichen Bezügen Koordinatenbezugssystemen bereit.
type: docs
weight: 370
url: /de/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` namespace stellt Klassen für die Arbeit mit räumlichen Bezügen (Koordinatenbezugssystemen) bereit.

## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [Axis](./axis/) | Eine Achse beschreibt eine Dimension von SRS. |
| [BursaWolfParameters](./bursawolfparameters/) | Klasse, die Parameter der Bursa-Wolf-Formel enthält, um sie in ein anderes Datum umzuwandeln. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | Verbund-SRS vereint zwei zugrunde liegende SRS, von denen keine zusammengesetzt sein kann. |
| [Ellipsoid](./ellipsoid/) | Ellipsoid stellt ein Ellipsoid dar, das sich der Erde annähert. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | Geozentrische SRS ist eine dreidimensionale kartesische SRS mit Ursprung im Erdmittelpunkt. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | Parameter zum Erstellen geozentrischer SRS. Parameter haben vernünftige Standardwerte, daher müssen Sie nur einige davon zuweisen. Wenn Sie zuweisen`null` Für jeden Parameter wird ein Standardwert verwendet. |
| [GeographicDatum](./geographicdatum/) | Das geografische Datum bezieht sich auf Längen- und Breitengrad auf einen bestimmten Ort auf der Erde. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | Ein geografisches SRS ist ein SRS, das auf Längen- und Breitengrad basiert. Ein geografisches SRS kann zweidimensional oder dreidimensional sein. Wenn ein geografisches SRS dreidimensional ist, dann ist es eigentlich ein zusammengesetztes SRS aus zweidimensionalem SRS und vertikalem SRS. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | Parameter zum Erstellen geografischer SRS. Parameter haben vernünftige Standardwerte, daher müssen Sie nur einige davon zuweisen. Wenn Sie zuweisen`null` Für jeden Parameter wird ein Standardwert verwendet. |
| [IdentifiableObject](./identifiableobject/) | Stellt ein Objekt dar, das EPSG-Code und Namen haben könnte. |
| [Identifier](./identifier/) | Stellt einen Bezeichner dar – einen Verweis auf eine externe Beschreibung eines Objekts. Wenn Sie eine SRS von WKT erstellen,[`Identifier`](../aspose.gis.spatialreferencing/identifier/) entspricht dem Schlüsselwort „AUTHORITY“. |
| [LocalDatum](./localdatum/) | Gibt die Methode an, die für Messungen im lokalen räumlichen Bezugssystem verwendet wird. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | Lokale SRS-bezogene Koordinaten zu einem Objekt, nicht zur Erde. |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian stellt einen Meridian dar, an dem der Längengrad als 0 definiert ist. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | Die projizierte SRS ist das Ergebnis der Anwendung einer Projektion auf eine geografische SRS. Eine projizierte SRS kann zweidimensional oder dreidimensional sein. Wenn die projizierte SRS dreidimensional ist, dann ist sie tatsächlich eine zusammengesetzte SRS aus einer zweidimensionalen projizierten SRS und einer eindimensionalen Vertikalen SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | Parameter zum Erstellen von projizierten SRS. Einige Parameter haben Voreinstellungen. Einige Parameter haben vernünftige Voreinstellungen, sodass Sie nicht nur diese zuweisen müssen. Wenn Sie zuweisen`null` Für diese Parameter wird ein Standardwert verwendet. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) Und[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) haben keine Voreinstellungen - Sie müssen einige nicht zuweisen`null` Wert für diese Eigenschaften. |
| [Projection](./projection/) | Stellt eine Projektionsmethode mit Parametern dar, die (Längengrad, Breitengrad) in (x, y) umwandelt. |
| [SpatialReferenceSystem](./spatialreferencesystem/) | Das räumliche Referenzsystem bildet Koordinaten mit Orten auf der Erde ab. Es gibt verschiedene Arten von SRS, siehe[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/) . Was mehr ist, wenn Typ SRS istGeographic oder Projected SRS kann zusammengesetzt oder einfach sein, siehe[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | Transformation des räumlichen Bezugssystems transformiert Geometrien aus dem räumlichen Bezugssystem der Quelle in das räumliche Bezugssystem des Ziels. |
| [TransformationException](./transformationexception/) | Transformationsausnahme wird ausgelöst, wenn während der Transformation von Koordinaten oder während der Transformationserstellung ein Fehler auftritt. |
| [Unit](./unit/) | Stellt die Maßeinheit dar. |
| [VerticalDatum](./verticaldatum/) | Gibt die für vertikale Messungen verwendete Methode an. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | Vertical SRS ist ein eindimensionales SRS, das Höhenkoordinaten beschreibt. |
## Aufzählung

| Aufzählung | Beschreibung |
| --- | --- |
| [AxisDirection](./axisdirection/) | Achsrichtung definiert die Richtung, in die die Achse zeigt. |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | Repräsentiert die Reihenfolge der Achsen in geozentrischen SRS. |
| [GeographicAxisesOrder](./geographicaxisesorder/) | Stellt die Reihenfolge der Achsen im geografischen SRS dar. |
| [ParameterType](./parametertype/) | Bestimmt den Typ des Parameters in[`Projection`](../aspose.gis.spatialreferencing/projection/) . |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | Stellt die Reihenfolge der Achsen im geografischen SRS dar. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | Repräsentiert die Art des räumlichen Bezugssystems. |


