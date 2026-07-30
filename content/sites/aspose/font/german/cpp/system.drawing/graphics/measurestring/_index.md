---
title: "System::Drawing::Graphics::MeasureString Methode"
linktitle: "MeasureString"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Graphics::MeasureString Methode. Gibt die Größe der angegebenen Zeichenfolge zurück, wenn sie in der angegebenen Schriftart im angegebenen Format in C++ gezeichnet wird."
type: docs
weight: 6500
url: /de/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


Gibt die Größe des angegebenen Strings zurück, wenn er in der angegebenen Schriftart im angegebenen Format gezeichnet wird.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | String const\& | Die Zeichenfolge, deren Größe berechnet werden soll |
| font | System::SharedPtr\<Font\> const\& | Die Schriftart, die zum Zeichnen der Zeichenfolge verwendet wird |
| width | int | Die maximale Breite der Zeichenfolge |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Gibt das Zeichenfolgenformat an |

### ReturnValue

Ein [SizeF](../../sizef/)-Objekt, das die Größe der Zeichenfolge in den Mess­einheiten darstellt, die durch die PageUnit‑Eigenschaft des aktuellen Graphics‑Objekts angegeben sind.

## Siehe auch

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Gibt die Größe des angegebenen Strings zurück, wenn er in der angegebenen Schriftart im angegebenen Format gezeichnet wird.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | String const\& | Die Zeichenfolge, deren Größe berechnet werden soll |
| font | System::SharedPtr\<Font\> const\& | Die Schriftart, die zum Zeichnen der Zeichenfolge verwendet wird |
| origin | PointF const\& | Gibt den Ort der oberen linken Ecke der Zeichenfolge an |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Gibt das Zeichenfolgenformat an |

### ReturnValue

Ein [SizeF](../../sizef/)-Objekt, das die Größe der Zeichenfolge in den Mess­einheiten darstellt, die durch die PageUnit‑Eigenschaft des aktuellen Graphics‑Objekts angegeben sind.

## Siehe auch

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


NICHT IMPLEMENTIERT.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## Siehe auch

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Gibt die Größe des angegebenen Strings zurück, wenn er in der angegebenen Schriftart im angegebenen Format gezeichnet wird.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | String const\& | Die Zeichenfolge, deren Größe berechnet werden soll |
| font | System::SharedPtr\<Font\> const\& | Die Schriftart, die zum Zeichnen der Zeichenfolge verwendet wird |
| layoutArea | SizeF const\& | Der maximale Layoutbereich der Zeichenkette |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Gibt das Zeichenfolgenformat an |

### ReturnValue

Ein [SizeF](../../sizef/)-Objekt, das die Größe der Zeichenfolge in den Mess­einheiten darstellt, die durch die PageUnit‑Eigenschaft des aktuellen Graphics‑Objekts angegeben sind.

## Siehe auch

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
