---
title: Class PreprocessingFilter
second_title: Aspose.OCR für .NET-API-Referenz
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter klas. Basisklasse für Bildverarbeitungsbefehle.
type: docs
weight: 170
url: /de/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Basisklasse für Bildverarbeitungsbefehle.

Basisklasse für Bildverarbeitungsbefehle.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Default_Constructor |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Ermöglicht die Verwendung eines zusätzlichen neuronalen Netzwerks zur Verbesserung des Bildes – Reduzierung von Rauschen. Nützlich für Bilder mit Scanartefakten, Verzerrungen, Flecken, Lichtreflexen, Farbverläufen und Fremdelementen. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Ermöglicht die Verwendung eines zusätzlichen neuronalen Netzwerks, um den Bildteil zu verbessern - Rauschen zu reduzieren. Nützlich für Bilder mit Scanartefakten, Verzerrungen, Flecken, Lichtreflexen, Farbverläufen und Fremdelementen. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Korrigiert automatisch geometrische Verzerrungen im Bild. Extrem ressourcenintensiv! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Aktiviert die automatische Bildschrägkorrektur. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Aktiviert die automatische Bildteil-Schrägkorrektur. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Konvertiert ein Bild in ein Schwarz-Weiß-Bild. Binäre Bilder sind Bilder, deren Pixel nur zwei mögliche Intensitätswerte haben. Sie werden normalerweise in Schwarzweiß angezeigt. Numerisch sind die beiden Werte oft 0 für Schwarz und 255 für Weiß. Binäre Bilder werden durch automatische Schwellenwertbildung für ein Bild erzeugt. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Konvertiert einen Teil des Bildes in ein Schwarz-Weiß-Bild. Binäre Bilder sind Bilder, deren Pixel nur zwei mögliche Intensitätswerte haben. Sie werden normalerweise in Schwarzweiß angezeigt. Numerisch sind die beiden Werte oft 0 für Schwarz und 255 für Weiß. Binäre Bilder werden durch automatische Schwellenwertbildung für ein Bild erzeugt. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Kontrastkorrekturfilter. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Kontrastkorrekturfilter für den Teil des Bildes. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | Dilatation fügt Pixel zu den Grenzen von Objekten in einem Bild hinzu. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | Dilatation fügt Pixel zu den Grenzen von Objekten in einem Teil des Bildes hinzu. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Kehrt Farben in einem Dokumentbild automatisch um. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Kehrt Farben in einem Teil des Bildes automatisch um. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Der Medianfilter durchläuft jedes Element des Bildes und ersetzt jedes Pixel durch den Median seiner Nachbarpixel. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Die Medianfilter durchlaufen jedes Element des Bildteils und ersetzen jedes Pixel durch den Median seiner Nachbarpixel. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Bild neu skalieren – Bildauflösung vergrößern oder verkleinern. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Bild neu skalieren - Bildauflösung hoch- oder herunterskalieren. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Originalbild drehen. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Einen Teil des Bildes drehen. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Bild neu skalieren – Bildauflösung vergrößern oder verkleinern. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Bild neu skalieren - Bildauflösung hoch- oder herunterskalieren. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Erstellen Sie ein Binärbild basierend auf der Festlegung eines Schwellenwerts für die Pixelintensität des Originalbilds. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Erstellen Sie einen binären Teil des Bildes basierend auf dem Festlegen eines Schwellenwerts für die Pixelintensität des ursprünglichen Bildteils. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Wandelt ein Bild in ein Graustufenbild um. Graustufenbilder haben 256 Helligkeitsstufen im Bild (0 bis 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Fügen Sie den neuen Filter zur Sammlung hinzu, um alle Vorgänge weiter auszuführen. Konsistenz in der Sammlung ist wichtig. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Für die IEnumerable-Schnittstellenrealisierung. |

### Siehe auch

* namensraum [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* Montage [Aspose.OCR](../../)


