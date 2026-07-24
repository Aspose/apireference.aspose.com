---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructor. Inicializa un PsDocument vacío. Este constructor se usa solo para operaciones adicionales que no están relacionadas con archivos PostScript, por ejemplo, convertir fuentes en C++."
type: docs
weight: 100
url: /es/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Inicializa un [PsDocument](../) vacío. Este constructor se usa solo para operaciones adicionales que no están relacionadas con archivos PostScript, por ejemplo, convertir fuentes.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Ver también

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Inicializa [PsDocument](../) con un flujo de archivo PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | Flujo de entrada del archivo PS/EPS. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Inicializa un [PsDocument](../) vacío con una página inicializada.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flujo donde guardar el archivo PS/EPS. |
| opciones | System::SharedPtr\<Device::PsSaveOptions\> | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Inicializa un [PsDocument](../) vacío.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flujo donde guardar el archivo PS/EPS. |
| opciones | System::SharedPtr\<Device::PsSaveOptions\> | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| multipaged | bool | Si false la página no se inicializará. En este caso, la inicialización de la página debe realizarse mediante una llamada explícita "openPage(width, height)". |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Inicializa un [PsDocument](../) vacío cuando se conoce de antemano el número de páginas del documento [Postscript](../../../aspose.page.eps.postscript/).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | Flujo donde guardar el archivo PS/EPS. |
| opciones | System::SharedPtr\<Device::PsSaveOptions\> | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| numberOfPages | int32_t | El número de páginas del documento PostScript. |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Inicializa un [PsDocument](../) vacío con una página inicializada.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsFilePath | System::String | La ruta del archivo de salida PS/EPS. |
| opciones | System::SharedPtr\<Device::PsSaveOptions\> | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |

## Ver también

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Inicializa un [PsDocument](../) vacío.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsFilePath | System::String | La ruta del archivo de salida PS/EPS. |
| opciones | System::SharedPtr\<Device::PsSaveOptions\> | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| multipaged | bool | Si false la página no se inicializará. En este caso, la inicialización de la página debe realizarse mediante una llamada explícita "openPage(width, height)". |

## Ver también

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Inicializa un [PsDocument](../) vacío cuando se conoce de antemano el número de páginas del documento [Postscript](../../../aspose.page.eps.postscript/).

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| outPsFilePath | System::String | La ruta del archivo de salida PS/EPS. |
| opciones | System::SharedPtr\<Device::PsSaveOptions\> | Un conjunto de parámetros que controlan el guardado del archivo PostScript. |
| numberOfPages | int32_t | El número de páginas del documento PostScript. |

## Ver también

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Inicializa [PsDocument](../) con un archivo PS/EPS de entrada.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| psFilePath | System::String | Ruta del archivo PS/EPS. |

## Ver también

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
