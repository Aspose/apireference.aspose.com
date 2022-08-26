---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.SpatialReferencing namnutrymme tillhandahåller klasser för att arbeta med rumsliga referenser koordinatreferenssystem.
type: docs
weight: 330
url: /sv/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` namnutrymme tillhandahåller klasser för att arbeta med rumsliga referenser (koordinatreferenssystem).

## Klasser

| Klass | Beskrivning |
| --- | --- |
| [Axis](./axis) | En axel beskriver en dimension av SRS. |
| [BursaWolfParameters](./bursawolfparameters) | Klass som innehåller parametrar för Bursa-Wolf-formeln för att transformera till en annan datum. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | Sammansatt SRS förenar två underliggande SRS, av vilka ingen kan vara sammansatt. |
| [Ellipsoid](./ellipsoid) | Ellipsoid representerar en ellipsoid, som approximerar jorden. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | Geocentric SRS är 3-dimensionell kartesisk SRS med ursprung i jordens centrum. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Parametrar för att skapa geocentrisk SRS. Parametrar har rimliga standardinställningar, så du måste bara tilldela några av dem. Om du tilldelar`null` för valfri parameter kommer ett standardvärde att användas. |
| [GeographicDatum](./geographicdatum) | Geografiskt datum relaterar longitud och latitud till en viss plats på jorden. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | En Geographic SRS är en SRS som är baserad på longitud och latitud. En Geographic SRS kan vara tvådimensionell eller tredimensionell. Om geografisk SRS är tredimensionell, så är det faktiskt en sammansatt SRS av tvådimensionell SRS och vertikal SRS. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Parametrar för att skapa geografiska SRS. Parametrar har rimliga standardinställningar, så du måste bara tilldela några av dem. Om du tilldelar`null` för valfri parameter kommer ett standardvärde att användas. |
| [IdentifiableObject](./identifiableobject) | Representerar ett objekt som kan ha EPSG-kod och namn. |
| [Identifier](./identifier) | Representerar en identifierare - en referens till extern beskrivning av ett objekt. Om du skapar en SRS från WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier) motsvarar nyckelordet "AUTHORITY". |
| [LocalDatum](./localdatum) | Indikerar metod som används för mätningar i lokala rumsliga referenssystem. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Lokala SRS-relaterade koordinater till något objekt, inte jord. |
| [PrimeMeridian](./primemeridian) | PrimeMeridian representerar en meridian där longituden definieras till 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | Projicerad SRS är ett resultat av applicering av en projektion till geografisk SRS. En projicerad SRS kan vara tvådimensionell eller tredimensionell. Om projicerad SRS är tredimensionell är det faktiskt en sammansatt SRS av tvådimensionell projicerad SRS och endimensionell vertikal SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Parametrar för att skapa projicerad SRS. Vissa parametrar har standardvärden. Vissa parametrar har rimliga standardvärden, så du behöver inte bara tilldela dem. Om du tilldelar`null` för dessa parametrar kommer ett standardvärde att användas. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname) och[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base) har inga standardvärden - du måste tilldela några icke`null` värde till dessa egenskaper. |
| [Projection](./projection) | Representerar en projektionsmetod med parametrar, som transformerar (longitud, latitud) till (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem) | Rumsliga referenssystem kartlägger koordinater till platser på jorden. Det finns olika typer av SRS, se[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type) . Vad mer, om typ av SRS ärGeographic or Projected SRS kan vara sammansatt eller singel, se[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | Transformation av rumsligt referenssystem omvandlar geometrier från rumsligt referenssystem för källan till rumsligt referenssystem för mål. |
| [TransformationException](./transformationexception) | Transformationsundantag skapas när fel uppstår under transformation av koordinat eller under transformation skapande. |
| [Unit](./unit) | Representerar måttenhet. |
| [VerticalDatum](./verticaldatum) | Indikerar metod som används för vertikala mätningar. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | Vertical SRS är en endimensionell SRS som beskriver höjdkoordinater. |
## Uppräkning

| Uppräkning | Beskrivning |
| --- | --- |
| [AxisDirection](./axisdirection) | Axelriktning definierar den riktning mot vilken axeln pekar. |
| [GeocentricAxisesOrder](./geocentricaxisesorder) | Representerar axelordningen i geocentrisk SRS. |
| [GeographicAxisesOrder](./geographicaxisesorder) | Representerar axelordningen i geografisk SRS. |
| [ParameterType](./parametertype) | Bestämmer typ av parameter i[`Projection`](../aspose.gis.spatialreferencing/projection) . |
| [ProjectedAxisesOrder](./projectedaxisesorder) | Representerar axelordningen i geografisk SRS. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype) | Representerar typ av rumsligt referenssystem. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
