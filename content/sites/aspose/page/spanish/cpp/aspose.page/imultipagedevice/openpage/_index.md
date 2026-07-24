---
title: "Aspose::Page::IMultiPageDevice::OpenPage método"
linktitle: "OpenPage"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage método. Realiza la preparación necesaria del dispositivo antes de renderizar cada página en C++."
type: docs
weight: 400
url: /es/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Realiza la preparación necesaria del dispositivo antes del renderizado de cada página.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | Un ancho de la página. |
| alto | float | Una altura de la página. |

### ReturnValue

Devuelve true si la página abierta tiene un número que se encuentra dentro de un rango de números de página seleccionados y false en caso contrario.

## Ver también

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Realiza la preparación necesaria del dispositivo antes del renderizado de la página.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| título | System::String | El título de la página. |

### ReturnValue

True si la página está dentro del rango solicitado, de lo contrario false. Utilizado en dispositivos que pueden renderizar una matriz especificada de números de página.

## Ver también

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
