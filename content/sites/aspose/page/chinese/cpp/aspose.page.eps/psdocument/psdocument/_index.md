---
title: "Aspose::Page::EPS::PsDocument::PsDocument 构造函数"
linktitle: "PsDocument"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument 构造函数。初始化空的 PsDocument。此构造函数仅用于与 PostScript 文件无关的附加操作，例如在 C++ 中转换字体。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


初始化空的 [PsDocument](../)。此构造函数仅用于与 PostScript 文件无关的附加操作，例如转换字体。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## 另见

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


使用 PS/EPS 文件流初始化 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS 文件的输入流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


使用已初始化的页面初始化空的 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | 用于保存 PS/EPS 文件的流。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 控制 PostScript 文件保存的参数集合。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


初始化空的 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | 用于保存 PS/EPS 文件的流。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 控制 PostScript 文件保存的参数集合。 |
| 多页 | bool | 如果为 false，则页面不会被初始化。在这种情况下，应通过显式的 \"openPage(width, height)\" 调用来进行页面初始化。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


在预先知道 [Postscript](../../../aspose.page.eps.postscript/) 文档页数时，初始化空的 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | 用于保存 PS/EPS 文件的流。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 控制 PostScript 文件保存的参数集合。 |
| numberOfPages | int32_t | PostScript 文档中的页数。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


使用已初始化的页面初始化空的 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outPsFilePath | System::String | 输出 PS/EPS 文件路径。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 控制 PostScript 文件保存的参数集合。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


初始化空的 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outPsFilePath | System::String | 输出 PS/EPS 文件路径。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 控制 PostScript 文件保存的参数集合。 |
| 多页 | bool | 如果为 false，则页面不会被初始化。在这种情况下，应通过显式的 \"openPage(width, height)\" 调用来进行页面初始化。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


在预先知道 [Postscript](../../../aspose.page.eps.postscript/) 文档页数时，初始化空的 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outPsFilePath | System::String | 输出 PS/EPS 文件路径。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 控制 PostScript 文件保存的参数集合。 |
| numberOfPages | int32_t | PostScript 文档中的页数。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


使用输入的 PS/EPS 文件初始化 [PsDocument](../)。

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS 文件路径。 |

## 另见

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
