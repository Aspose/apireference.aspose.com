---
title: VectorLayer.Convert
second_title: Aspose.GIS voor .NET API-referentie
description: VectorLayer methode. Converteer een laag naar een ander formaat.
type: docs
weight: 200
url: /nl/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Converteer een laag naar een ander formaat.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sourcePath | String | Pad naar de laag die wordt geconverteerd. |
| sourceDriver | FileDriver | Het formaatstuurprogramma voor de bronlaag. |
| destinationPath | String | Pad naar de laag die wordt gemaakt als resultaat van de conversie. |
| destinationDriver | FileDriver | Het formaatstuurprogramma voor de bestemmingslaag. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk van de paden is`null`. |

### Zie ook

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Converteer een laag naar een ander formaat.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sourcePath | AbstractPath | Pad naar de laag die wordt geconverteerd. |
| sourceDriver | FileDriver | Het formaatstuurprogramma voor de bronlaag. |
| destinationPath | AbstractPath | Pad naar de laag die wordt gemaakt als resultaat van de conversie. |
| destinationDriver | FileDriver | Het formaatstuurprogramma voor de bestemmingslaag. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk van de paden is`null`. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Converteer een laag naar een ander formaat.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sourcePath | String | Pad naar de laag die wordt geconverteerd. |
| sourceDriver | FileDriver | Het formaatstuurprogramma voor de bronlaag. |
| destinationPath | String | Pad naar de laag die wordt gemaakt als resultaat van de conversie. |
| destinationDriver | FileDriver | Het formaatstuurprogramma voor de bestemmingslaag. |
| options | ConversionOptions | Opties voor de conversieprocedure. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk van de paden is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het lezen of schrijven van de functie naar/van het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem gespecificeerd in*options* wordt niet ondersteund door*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformatie van objectgeometrie van ruimtelijk bronreferentiesysteem naar doelruimtelijk referentiesysteem mislukt. |

### Zie ook

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Converteer een laag naar een ander formaat.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sourcePath | AbstractPath | Pad naar de laag die wordt geconverteerd. |
| sourceDriver | FileDriver | Het formaatstuurprogramma voor de bronlaag. |
| destinationPath | AbstractPath | Pad naar de laag die wordt gemaakt als resultaat van de conversie. |
| destinationDriver | FileDriver | Het formaatstuurprogramma voor de bestemmingslaag. |
| options | ConversionOptions | Opties voor de conversieprocedure. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk van de paden is`null`. |
| ArgumentException | Het object Opties heeft een onjuist type voor dit stuurprogramma. |
| [GisException](../../gisexception/) | Fout bij het lezen of schrijven van de functie naar/van het bestand. |
| IOException | Er is een I/O-fout opgetreden. |
| NotSupportedException | Ruimtelijk referentiesysteem gespecificeerd in*options* wordt niet ondersteund door*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformatie van objectgeometrie van ruimtelijk bronreferentiesysteem naar doelruimtelijk referentiesysteem mislukt. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)


