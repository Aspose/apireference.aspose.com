---
title: Type1MetricFont
second_title: Aspose.Font für .NET-API-Referenz
description: Implementierung metrischer Type1Schriftarten. Diese Type1Schriftart wird nur mit Metriken erstellt. Funktionen zum Abrufen von Glyphen und einige andere die eine echte Schriftart erfordern sind nicht zulässig nicht zulässige Funktionen lösen eine Ausnahme ausType1NotSupportedException . Andere Eigenschaften FontName Gewicht Metriken und Codierung werden aus der Metrikdatei verwendet.
type: docs
weight: 1080
url: /de/net/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class

Implementierung metrischer Type1-Schriftarten. Diese Type1-Schriftart wird nur mit Metriken erstellt. Funktionen zum Abrufen von Glyphen und einige andere, die eine echte Schriftart erfordern, sind nicht zulässig, nicht zulässige Funktionen lösen eine Ausnahme ausType1NotSupportedException . Andere Eigenschaften (FontName, Gewicht, Metriken und Codierung) werden aus der Metrikdatei verwendet.

```csharp
public class Type1MetricFont : Type1Font
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1metricfont/encoding) { get; } | Die Kodierung ist in der Metrikdatei definiert. StandardAdobeEncoding: die Kodierung wird automatisch ausgefüllt |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition) { get; } | Ruft die Schriftartdefinition ab. |
| override [FontFamily](../../aspose.font.type1/type1metricfont/fontfamily) { get; } | Ruft die Schriftfamilie ab. |
| override [FontName](../../aspose.font.type1/type1metricfont/fontname) { get; } | Ruft den Namen der Schriftart ab. |
| override [FontNames](../../aspose.font.type1/type1font/fontnames) { get; } | Ruft Schriftnamen ab. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Ruft die Funktion zum Speichern von Schriftarten ab. |
| override [FontStyle](../../aspose.font.type1/type1metricfont/fontstyle) { get; } | Ruft den Schriftstil ab. Dies ist ein Wert, der in verallgemeinertem Typ berechnet und dargestellt wird. |
| override [FontType](../../aspose.font.type1/type1font/fonttype) { get; } | Ruft den Schriftarttyp ab. Gibt den FontType.Type1-Wert zurück. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Font-Glyphen-Accessor. Ruft Glyphen und Glyphenkennungen ab. |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype) { get; } | Spezifikation des Glyphen-ID-Typs. |
| override [Metrics](../../aspose.font.type1/type1font/metrics) { get; } | Ruft Schriftartmetriken ab. |
| override [NumGlyphs](../../aspose.font.type1/type1metricfont/numglyphs) { get; } | Ruft die Anzahl der Glyphen in der Schriftart ab. |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames) { get; } | Ruft Postscript-Schriftartennamen ab. |
| override [Style](../../aspose.font.type1/type1metricfont/style) { get; } | Ruft den Schriftstil ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert)(FontType) | Konvertiert die Schriftart in ein anderes Format. |
| override [GetAllGlyphIds](../../aspose.font.type1/type1metricfont/getallglyphids)() | Gibt alle Glyphen-IDs zurück, die in der Schriftart verfügbar sind. Nicht unterstützt für[`Type1MetricFont`](../type1metricfont)Typ. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid)(GlyphId) | Gibt Glyphe nach Glyphen-ID zurück. Nicht unterstützt für[`Type1MetricFont`](../type1metricfont)Typ. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid_1)(string) | Gibt Glyphe nach Glyphen-ID zurück. Nicht unterstützt für[`Type1MetricFont`](../type1metricfont)Typ. |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid)(uint) | Gibt Glyphe nach Glyphen-ID zurück. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext)(string) | Ruft Glyphendarstellung für Text ab. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Speichert die Schriftart im Originalformat. |
| virtual [Save](../../aspose.font/font/save)(string) | Speichert die Schriftart im Originalformat. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Speichert die Schriftart im angegebenen Format. |

### Beispiele

Hinweis: Wenn die Metrikdatei die Codierung als „FontSpecific“ definiert, sollte der Benutzer die spezifische Codierung folgendermaßen angeben:  System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u"space", u"a1", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

### Siehe auch

* class [Type1Font](../type1font)
* namensraum [Aspose.Font.Type1](../../aspose.font.type1)
* Montage [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
