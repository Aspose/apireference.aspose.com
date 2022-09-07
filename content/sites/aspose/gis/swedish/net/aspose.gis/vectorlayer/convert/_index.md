---
title: Convert
second_title: Aspose.GIS för .NET API Referens
description: Konvertera ett lager till ett annat format.
type: docs
weight: 180
url: /sv/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Konvertera ett lager till ett annat format.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sourcePath | String | Sökväg till lagret som kommer att konverteras. |
| sourceDriver | FileDriver | Formatdrivrutinen för källlagret. |
| destinationPath | String | Sökväg till lagret som skapas som ett resultat av konverteringen. |
| destinationDriver | FileDriver | Formatdrivrutinen för destinationslagret. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Endera av vägarna är`null`. |

### Se även

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Konvertera ett lager till ett annat format.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sourcePath | AbstractPath | Sökväg till lagret som kommer att konverteras. |
| sourceDriver | FileDriver | Formatdrivrutinen för källlagret. |
| destinationPath | AbstractPath | Sökväg till lagret som skapas som ett resultat av konverteringen. |
| destinationDriver | FileDriver | Formatdrivrutinen för destinationslagret. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Endera av vägarna är`null`. |

### Se även

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Konvertera ett lager till ett annat format.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sourcePath | String | Sökväg till lagret som kommer att konverteras. |
| sourceDriver | FileDriver | Formatdrivrutinen för källlagret. |
| destinationPath | String | Sökväg till lagret som skapas som ett resultat av konverteringen. |
| destinationDriver | FileDriver | Formatdrivrutinen för destinationslagret. |
| options | ConversionOptions | Alternativ för konverteringsproceduren. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Endera av vägarna är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att läsa eller skriva funktionen till/från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem specificerat i*options*stöds inte av*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Transformation av funktioners geometri från källans rumsliga referenssystem till det rumsliga referenssystemet för målet misslyckades. |

### Se även

* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Konvertera ett lager till ett annat format.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sourcePath | AbstractPath | Sökväg till lagret som kommer att konverteras. |
| sourceDriver | FileDriver | Formatdrivrutinen för källlagret. |
| destinationPath | AbstractPath | Sökväg till lagret som skapas som ett resultat av konverteringen. |
| destinationDriver | FileDriver | Formatdrivrutinen för destinationslagret. |
| options | ConversionOptions | Alternativ för konverteringsproceduren. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Endera av vägarna är`null`. |
| ArgumentException | Options-objektet har en felaktig typ för den här drivrutinen. |
| [GisException](../../gisexception) | Det gick inte att läsa eller skriva funktionen till/från filen. |
| IOException | Ett I/O-fel uppstod. |
| NotSupportedException | Rumsligt referenssystem specificerat i*options*stöds inte av*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Transformation av funktioners geometri från källans rumsliga referenssystem till det rumsliga referenssystemet för målet misslyckades. |

### Se även

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* namnutrymme [Aspose.Gis](../../vectorlayer)
* hopsättning [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
