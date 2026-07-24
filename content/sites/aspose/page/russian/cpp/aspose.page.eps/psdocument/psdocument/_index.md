---
title: "Aspose::Page::EPS::PsDocument::PsDocument конструктор"
linktitle: "PsDocument"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument конструктор. Инициализирует пустой PsDocument. Этот конструктор используется только для дополнительных операций, не связанных с файлами PostScript, например, для преобразования шрифтов в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Инициализирует пустой [PsDocument](../). Этот конструктор используется только для дополнительных операций, не связанных с файлами PostScript, например, для преобразования шрифтов.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## См. также

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Инициализирует [PsDocument](../) потоком PS/EPS файла.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Входной поток PS/EPS файла. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Инициализирует пустой [PsDocument](../) с инициализированной страницей.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Поток, в который сохраняется файл PS/EPS. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Набор параметров, контролирующих сохранение файла PostScript. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Инициализирует пустой [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Поток, в который сохраняется файл PS/EPS. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Набор параметров, контролирующих сохранение файла PostScript. |
| многостраничный | bool | Если false, страница не будет инициализирована. В этом случае инициализацию страницы следует выполнить через явный вызов \"openPage(width, height)\". |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Инициализирует пустой [PsDocument](../), когда количество страниц документа [Postscript](../../../aspose.page.eps.postscript/) известно заранее.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Поток, в который сохраняется файл PS/EPS. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Набор параметров, контролирующих сохранение файла PostScript. |
| numberOfPages | int32_t | Количество страниц в документе PostScript. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Инициализирует пустой [PsDocument](../) с инициализированной страницей.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsFilePath | System::String | Путь к выходному файлу PS/EPS. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Набор параметров, контролирующих сохранение файла PostScript. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Инициализирует пустой [PsDocument](../).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsFilePath | System::String | Путь к выходному файлу PS/EPS. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Набор параметров, контролирующих сохранение файла PostScript. |
| многостраничный | bool | Если false, страница не будет инициализирована. В этом случае инициализацию страницы следует выполнить через явный вызов \"openPage(width, height)\". |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Инициализирует пустой [PsDocument](../), когда количество страниц документа [Postscript](../../../aspose.page.eps.postscript/) известно заранее.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsFilePath | System::String | Путь к выходному файлу PS/EPS. |
| параметры | System::SharedPtr\<Device::PsSaveOptions\> | Набор параметров, контролирующих сохранение файла PostScript. |
| numberOfPages | int32_t | Количество страниц в документе PostScript. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Инициализирует [PsDocument](../) с входным файлом PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| psFilePath | System::String | Путь к файлу PS/EPS. |

## См. также

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
