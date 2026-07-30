---
title: "System::Drawing::Font::Font constructeur"
linktitle: "Police"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Font::Font constructeur. Crée une nouvelle instance de la classe Font qui représente la police existante spécifiée avec le style de police spécifié en C++."
type: docs
weight: 100
url: /fr/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


Construit une nouvelle instance de la classe [Font](../) qui représente la police existante spécifiée avec le style de police spécifié.

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prototype | const SharedPtr\<Font\>\& | La police existante à partir de laquelle créer la nouvelle |
| new_style | StyleDePolice | Un style de police à appliquer à la nouvelle police |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


Construit une nouvelle instance de la classe [Font](../).

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| famille | const SharedPtr\<FontFamily\>\& | La famille de polices de la nouvelle police |
| em_size | float | La taille em de la nouvelle police dans les unités spécifiées par le paramètre **unit** |
| style | StyleDePolice | Le style de la nouvelle police |
| unité | GraphicsUnit | Les unités de mesure de la nouvelle police |
| gdi_charset | uint8_t | Un charset GDI à utiliser pour la nouvelle police |
| gdi_vertical_font | bool | Vrai si la nouvelle police est dérivée d'une police verticale GDI |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


Construit une nouvelle instance de la classe [Font](../).

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| famille | const SharedPtr\<FontFamily\>\& | La famille de polices de la nouvelle police |
| em_size | float | La taille em de la nouvelle police dans les unités spécifiées par le paramètre **unit** |
| unité | GraphicsUnit | Les unités de mesure de la nouvelle police |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


Construit une nouvelle instance de la classe [Font](../).

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| family_name | const String\& | Le nom de la famille de polices de la nouvelle police |
| em_size | float | La taille em de la nouvelle police dans les unités spécifiées par le paramètre **unit** |
| style | StyleDePolice | Le style de la nouvelle police |
| unité | GraphicsUnit | Les unités de mesure de la nouvelle police |
| gdi_charset | uint8_t | Un charset GDI à utiliser pour la nouvelle police |
| gdi_vertical_font | bool | Vrai si la nouvelle police est dérivée d'une police verticale GDI |

## Voir aussi

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


Construit une nouvelle instance de la classe [Font](../).

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| family_name | const String\& | Le nom de la famille de polices de la nouvelle police |
| em_size | float | La taille em de la nouvelle police dans les unités spécifiées par le paramètre **unit** |
| unité | GraphicsUnit | Les unités de mesure de la nouvelle police |

## Voir aussi

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
