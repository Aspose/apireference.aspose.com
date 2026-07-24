---
title: "System::Drawing::Graphics::SetClip yöntemi"
linktitle: "SetClip"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Graphics::SetClip yöntemi. Geçerli Graphics nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, mevcut kırpma bölgesi ile bir grafik yolu tarafından belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna C++'ta ayarlar."
type: docs
weight: 8600
url: /tr/cpp/system.drawing/graphics/setclip/
---
## Graphics::SetClip(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) method


Geçerli [Graphics](../) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, mevcut kırpma bölgesi ile bir grafik yolu tarafından belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Drawing2D::GraphicsPath> &path, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const SharedPtr\<Drawing2D::GraphicsPath\>\& | Birleştirilecek bir bölge belirtir |
| combineMode | Drawing2D::CombineMode | Birleştirme işlemini belirtir |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) method


UYGULANMADI.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Graphics> &graphics, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) method


Geçerli [Graphics](../) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, mevcut kırpma bölgesi ile belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Region> &region, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| bölge | const SharedPtr\<Region\>\& | Birleştirilecek bir bölge belirtir |
| combineMode | Drawing2D::CombineMode | Birleştirme işlemini belirtir |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(Rectangle, Drawing2D::CombineMode) method


Geçerli [Graphics](../) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, mevcut kırpma bölgesi ile belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar.

```cpp
void System::Drawing::Graphics::SetClip(Rectangle rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rect | Dikdörtgen | Birleştirilecek bir bölge belirtir |
| combineMode | Drawing2D::CombineMode | Birleştirme işlemini belirtir |

## Ayrıca Bakınız

* Class [Rectangle](../../rectangle/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(RectangleF, Drawing2D::CombineMode) method


Geçerli [Graphics](../) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, mevcut kırpma bölgesi ile belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar.

```cpp
void System::Drawing::Graphics::SetClip(RectangleF rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rect | RectangleF | Birleştirilecek bir bölge belirtir |
| combineMode | Drawing2D::CombineMode | Birleştirme işlemini belirtir |

## Ayrıca Bakınız

* Class [RectangleF](../../rectanglef/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
