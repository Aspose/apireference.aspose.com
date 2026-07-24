---
title: "Método Aspose::Page::XPS::XpsDocument::InsertPage"
linktitle: "InsertPage"
second_title: "Aspose.Page para C++"
description: "Método Aspose::Page::XPS::XpsDocument::InsertPage. Inserta una página vacía en el documento con el tamaño de página predeterminado en la posición de índice en C++."
type: docs
weight: 4500
url: /es/cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


Inserta una página vacía en el documento con tamaño de página predeterminado en la posición *index*.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int32_t | Posición en la que se debe insertar una página. |
| activar | bool | Indicador que indica si se debe seleccionar la página insertada como activa. |

### ReturnValue

Página insertada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


Inserta una página vacía en el documento con *width* y *height* especificados en la posición *index*.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int32_t | Posición en la que se debe insertar una página. |
| ancho | float | Ancho de una página nueva. |
| alto | float | Altura de una página nueva. |
| activar | bool | Indicador que indica si se debe seleccionar la página insertada como activa. |

### ReturnValue

Página insertada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


Inserta una página en el documento en la posición *index*.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int32_t | Posición en la que se debe agregar una página. |
| page | System::SharedPtr\<XpsModel::XpsPage\> | [Page](../../../aspose.page/) a insertar. |
| activar | bool | Indicador que indica si se debe seleccionar la página insertada como activa. |

### ReturnValue

Página insertada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
