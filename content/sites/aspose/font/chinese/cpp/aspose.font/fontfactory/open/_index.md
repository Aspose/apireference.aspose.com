---
title: "Aspose::Font::FontFactory::Open 方法"
linktitle: "Open"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::FontFactory::Open 方法。打开字体，使用 C++ 中的字体类型和字体数据字节数组。"
type: docs
weight: 200
url: /zh/cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


使用字体类型和字体数据字节数组打开字体。

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) 类型。 |
| fontData | System::ArrayPtr\<uint8_t\> | 用于加载字体的字节数组。 |

### ReturnValue

[Font](../../font/) loaded.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


使用字体类型和流源打开字体。

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) 类型。 |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | 字体的流源。 |

### ReturnValue

[Font](../../font/) loaded.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


使用字体类型和字体文件名打开字体。

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) 类型。 |
| fileName | System::String | [Font](../../font/) 文件名。 |

### ReturnValue

[Font](../../font/) loaded.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


使用 FontDefinition 对象打开字体。

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) 定义对象。 |

### ReturnValue

[Font](../../font/) loaded.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
