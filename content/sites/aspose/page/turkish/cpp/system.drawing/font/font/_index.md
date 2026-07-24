---
title: "System::Drawing::Font::Font yapıcı"
linktitle: "Yazı tipi"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Font::Font yapıcı. C++'da belirtilen mevcut yazı tipini ve belirtilen yazı tipi stilini temsil eden Font sınıfının yeni bir örneğini oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


Belirtilen mevcut yazı tipini ve belirtilen yazı tipi stilini temsil eden yeni bir [Font](../) sınıfı örneği oluşturur.

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| prototip | const SharedPtr\<Font\>\& | Yeni oluşturulacak yazı tipinin alınacağı mevcut yazı tipi |
| new_style | FontStyle | Yeni yazı tipine uygulanacak bir yazı tipi stili |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


Yeni bir [Font](../) sınıfı örneği oluşturur.

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| aile | const SharedPtr\<FontFamily\>\& | Yeni yazı tipinin yazı tipi ailesi |
| em_size | float | Yeni yazı tipinin **unit** parametresiyle belirtilen birimlerdeki em boyutu |
| stil | FontStyle | Yeni yazı tipinin stili |
| birim | GraphicsUnit | Yeni yazı tipinin ölçüm birimleri |
| gdi_charset | uint8_t | Yeni yazı tipi için kullanılacak bir GDI karakter kümesi |
| gdi_vertical_font | bool | Yeni yazı tipi bir GDI dikey yazı tipinden türetilmişse doğru |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


Yeni bir [Font](../) sınıfı örneği oluşturur.

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| aile | const SharedPtr\<FontFamily\>\& | Yeni yazı tipinin yazı tipi ailesi |
| em_size | float | Yeni yazı tipinin **unit** parametresiyle belirtilen birimlerdeki em boyutu |
| birim | GraphicsUnit | Yeni yazı tipinin ölçüm birimleri |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


Yeni bir [Font](../) sınıfı örneği oluşturur.

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| family_name | const String\& | Yeni yazı tipinin yazı tipi ailesinin adı |
| em_size | float | Yeni yazı tipinin **unit** parametresiyle belirtilen birimlerdeki em boyutu |
| stil | FontStyle | Yeni yazı tipinin stili |
| birim | GraphicsUnit | Yeni yazı tipinin ölçüm birimleri |
| gdi_charset | uint8_t | Yeni yazı tipi için kullanılacak bir GDI karakter kümesi |
| gdi_vertical_font | bool | Yeni yazı tipi bir GDI dikey yazı tipinden türetilmişse doğru |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


Yeni bir [Font](../) sınıfı örneği oluşturur.

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| family_name | const String\& | Yeni yazı tipinin yazı tipi ailesinin adı |
| em_size | float | Yeni yazı tipinin **unit** parametresiyle belirtilen birimlerdeki em boyutu |
| birim | GraphicsUnit | Yeni yazı tipinin ölçüm birimleri |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
