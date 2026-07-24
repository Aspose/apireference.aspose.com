---
title: "System::Drawing::Graphics::MeasureString metod"
linktitle: "MeasureString"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Graphics::MeasureString metod. Returnerar en storlek för den angivna strängen när den ritas med det angivna teckensnittet i det angivna formatet i C++."
type: docs
weight: 6500
url: /sv/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


Returnerar storleken på den angivna strängen när den ritas med det angivna teckensnittet i det angivna formatet.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | String const\& | Strängen vars storlek ska beräknas |
| font | System::SharedPtr\<Font\> const\& | Teckensnittet som används för att rita strängen |
| bredd | int | Den maximala bredden på strängen |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Anger strängformatet |

### ReturnValue

Ett [SizeF](../../sizef/)‑objekt som representerar strängens storlek i mätenheterna som anges av egenskapen PageUnit för det aktuella Graphics‑objektet.

## Se även

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Returnerar storleken på den angivna strängen när den ritas med det angivna teckensnittet i det angivna formatet.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | String const\& | Strängen vars storlek ska beräknas |
| font | System::SharedPtr\<Font\> const\& | Teckensnittet som används för att rita strängen |
| origin | PointF const\& | Anger platsen för strängens övre vänstra hörn |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Anger strängformatet |

### ReturnValue

Ett [SizeF](../../sizef/)‑objekt som representerar strängens storlek i mätenheterna som anges av egenskapen PageUnit för det aktuella Graphics‑objektet.

## Se även

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


INTE IMPLEMENTERAT.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## Se även

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Returnerar storleken på den angivna strängen när den ritas med det angivna teckensnittet i det angivna formatet.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | String const\& | Strängen vars storlek ska beräknas |
| font | System::SharedPtr\<Font\> const\& | Teckensnittet som används för att rita strängen |
| layoutArea | SizeF const\& | Det maximala layoutområdet för strängen |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Anger strängformatet |

### ReturnValue

Ett [SizeF](../../sizef/)‑objekt som representerar strängens storlek i mätenheterna som anges av egenskapen PageUnit för det aktuella Graphics‑objektet.

## Se även

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
