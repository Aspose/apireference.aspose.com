---
title: Aspose::Page::EPS::PsDocument::PsDocument constructor
linktitle: PsDocument
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::PsDocument constructor. Initializes PsDocument with a stream of PS/EPS file in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Initializes [PsDocument](../) with a stream of PS/EPS file.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Type | Description |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Input stream of PS/EPS file. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initializes empty [PsDocument](../) with initialized page.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stream where to save PS/EPS file. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | A set of parameters controlling saving of PostScript file. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initializes empty [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stream where to save PS/EPS file. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | A set of parameters controlling saving of PostScript file. |
| multipaged | bool | If false page will not be initialized. In this case page initialization should be performed via explicit "openPage(width, height) call. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initializes empty [PsDocument](../) when the number of [Postscript](../../../aspose.page.eps.postscript/) document pages is known in advance.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Stream where to save PS/EPS file. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | A set of parameters controlling saving of PostScript file. |
| numberOfPages | int32_t | The number of pages in the PostScript document. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Initializes empty [PsDocument](../) with initialized page.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outPsFilePath | System::String | The output PS/EPS file path. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | A set of parameters controlling saving of PostScript file. |

## See Also

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Initializes empty [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outPsFilePath | System::String | The output PS/EPS file path. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | A set of parameters controlling saving of PostScript file. |
| multipaged | bool | If false page will not be initialized. In this case page initialization should be performed via explicit "openPage(width, height) call. |

## See Also

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Initializes empty [PsDocument](../) when the number of [Postscript](../../../aspose.page.eps.postscript/) document pages is known in advance.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Description |
| --- | --- | --- |
| outPsFilePath | System::String | The output PS/EPS file path. |
| options | System::SharedPtr\<Device::PsSaveOptions\> | A set of parameters controlling saving of PostScript file. |
| numberOfPages | int32_t | The number of pages in the PostScript document. |

## See Also

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Initializes [PsDocument](../) with an input PS/EPS file.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Type | Description |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS file path. |

## See Also

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
