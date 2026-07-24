---
title: "System::Drawing::Font::Font konstruktor"
linktitle: "Teckensnitt"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Font::Font konstruktor. Skapar en ny instans av Font‑klassen som representerar det angivna befintliga typsnittet med den angivna typsnittsstilen i C++."
type: docs
weight: 100
url: /sv/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


Skapar en ny instans av [Font](../)-klassen som representerar det angivna befintliga typsnittet med den angivna typsnittsstilen.

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| prototyp | const SharedPtr\<Font\>\& | Det befintliga typsnittet att skapa det nya från |
| new_style | FontStyle | En typsnittsstil att tillämpa på det nya typsnittet |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


Skapar en ny instans av [Font](../)-klassen.

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| familj | const SharedPtr\<FontFamily\>\& | Typsnittsfamiljen för det nya typsnittet |
| em_size | float | Em‑storleken på det nya typsnittet i de enheter som anges av parametern **unit** |
| stil | FontStyle | Stilen för det nya typsnittet |
| enhet | GraphicsUnit | Mäteenheterna för det nya typsnittet |
| gdi_charset | uint8_t | En GDI-teckenuppsättning att användas för det nya teckensnittet |
| gdi_vertical_font | bool | Sant om det nya teckensnittet är härlett från ett GDI-vertikalt teckensnitt |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


Skapar en ny instans av [Font](../)-klassen.

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| familj | const SharedPtr\<FontFamily\>\& | Typsnittsfamiljen för det nya typsnittet |
| em_size | float | Em‑storleken på det nya typsnittet i de enheter som anges av parametern **unit** |
| enhet | GraphicsUnit | Mäteenheterna för det nya typsnittet |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


Skapar en ny instans av [Font](../)-klassen.

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| family_name | const String\& | Namnet på det nya teckensnittets teckensnittsfamilj |
| em_size | float | Em‑storleken på det nya typsnittet i de enheter som anges av parametern **unit** |
| stil | FontStyle | Stilen för det nya typsnittet |
| enhet | GraphicsUnit | Mäteenheterna för det nya typsnittet |
| gdi_charset | uint8_t | En GDI-teckenuppsättning att användas för det nya teckensnittet |
| gdi_vertical_font | bool | Sant om det nya teckensnittet är härlett från ett GDI-vertikalt teckensnitt |

## Se även

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


Skapar en ny instans av [Font](../)-klassen.

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| family_name | const String\& | Namnet på det nya teckensnittets teckensnittsfamilj |
| em_size | float | Em‑storleken på det nya typsnittet i de enheter som anges av parametern **unit** |
| enhet | GraphicsUnit | Mäteenheterna för det nya typsnittet |

## Se även

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
