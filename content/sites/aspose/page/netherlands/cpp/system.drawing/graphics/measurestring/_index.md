---
title: "System::Drawing::Graphics::MeasureString methode"
linktitle: "MeasureString"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Graphics::MeasureString methode. Retourneert een grootte van de opgegeven string wanneer deze wordt getekend in het opgegeven lettertype in het opgegeven formaat in C++."
type: docs
weight: 6500
url: /nl/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


Retourneert een grootte van de opgegeven tekenreeks wanneer deze wordt getekend in het opgegeven lettertype in het opgegeven formaat.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | String const\& | De string waarvan de grootte moet worden berekend |
| lettertype | System::SharedPtr\<Font\> const\& | Het lettertype dat wordt gebruikt om de string te tekenen |
| width | int | De maximale breedte van de string |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Specificeert het stringformaat |

### ReturnValue

Een [SizeF](../../sizef/) object dat de grootte van de string weergeeft in de meeteenheden gespecificeerd door de PageUnit-eigenschap van het huidige Grapphics-object.

## Zie ook

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Retourneert een grootte van de opgegeven tekenreeks wanneer deze wordt getekend in het opgegeven lettertype in het opgegeven formaat.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | String const\& | De string waarvan de grootte moet worden berekend |
| lettertype | System::SharedPtr\<Font\> const\& | Het lettertype dat wordt gebruikt om de string te tekenen |
| origin | PointF const\& | Specificeert de locatie van de linkerbovenhoek van de string |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Specificeert het stringformaat |

### ReturnValue

Een [SizeF](../../sizef/) object dat de grootte van de string weergeeft in de meeteenheden gespecificeerd door de PageUnit-eigenschap van het huidige Grapphics-object.

## Zie ook

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


NOG NIET GEÏMPLENTEERD.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## Zie ook

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Retourneert een grootte van de opgegeven tekenreeks wanneer deze wordt getekend in het opgegeven lettertype in het opgegeven formaat.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | String const\& | De string waarvan de grootte moet worden berekend |
| lettertype | System::SharedPtr\<Font\> const\& | Het lettertype dat wordt gebruikt om de string te tekenen |
| layoutArea | SizeF const\& | Het maximale lay-outgebied van de string |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Specificeert het stringformaat |

### ReturnValue

Een [SizeF](../../sizef/) object dat de grootte van de string weergeeft in de meeteenheden gespecificeerd door de PageUnit-eigenschap van het huidige Grapphics-object.

## Zie ook

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
