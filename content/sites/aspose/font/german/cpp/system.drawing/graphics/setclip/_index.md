---
title: "System::Drawing::Graphics::SetClip Methode"
linktitle: "SetClip"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Graphics::SetClip Methode. Setzt den Clipping‑Bereich der Zeichenfläche, die durch das aktuelle Graphics-Objekt dargestellt wird, auf das Ergebnis der angegebenen Operation, die den aktuellen Clip‑Bereich und den durch einen Grafikpfad angegebenen Bereich kombiniert, in C++."
type: docs
weight: 8600
url: /de/cpp/system.drawing/graphics/setclip/
---
## Graphics::SetClip(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) method


Setzt den Clipping‑Bereich der Zeichenfläche, die durch das aktuelle [Graphics](../) Objekt dargestellt wird, auf das Ergebnis der angegebenen Operation, die den aktuellen Clip‑Bereich und den durch einen Grafikpfad angegebenen Bereich kombiniert.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Drawing2D::GraphicsPath> &path, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const SharedPtr\<Drawing2D::GraphicsPath\>\& | Gibt einen zu kombinierenden Bereich an |
| combineMode | Drawing2D::CombineMode | Gibt die Kombinationsoperation an |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) method


NICHT IMPLEMENTIERT.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Graphics> &graphics, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) method


Setzt den Clipping‑Bereich der Zeichenfläche, die durch das aktuelle [Graphics](../)-Objekt dargestellt wird, auf das Ergebnis der angegebenen Operation, die den aktuellen Clip‑Bereich und den angegebenen Bereich kombiniert.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Region> &region, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Region | const SharedPtr\<Region\>\& | Gibt einen zu kombinierenden Bereich an |
| combineMode | Drawing2D::CombineMode | Gibt die Kombinationsoperation an |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(Rectangle, Drawing2D::CombineMode) method


Setzt den Clipping‑Bereich der Zeichenfläche, die durch das aktuelle [Graphics](../)-Objekt dargestellt wird, auf das Ergebnis der angegebenen Operation, die den aktuellen Clip‑Bereich und den angegebenen Bereich kombiniert.

```cpp
void System::Drawing::Graphics::SetClip(Rectangle rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rect | Rechteck | Gibt einen zu kombinierenden Bereich an |
| combineMode | Drawing2D::CombineMode | Gibt die Kombinationsoperation an |

## Siehe auch

* Class [Rectangle](../../rectangle/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(RectangleF, Drawing2D::CombineMode) method


Setzt den Clipping‑Bereich der Zeichenfläche, die durch das aktuelle [Graphics](../)-Objekt dargestellt wird, auf das Ergebnis der angegebenen Operation, die den aktuellen Clip‑Bereich und den angegebenen Bereich kombiniert.

```cpp
void System::Drawing::Graphics::SetClip(RectangleF rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rect | RectangleF | Gibt einen zu kombinierenden Bereich an |
| combineMode | Drawing2D::CombineMode | Gibt die Kombinationsoperation an |

## Siehe auch

* Class [RectangleF](../../rectanglef/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
