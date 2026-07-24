---
title: "Aspose::Page::AssemblyConstants clase"
linktitle: "AssemblyConstants"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::AssemblyConstants clase. Define las constantes que participan en la verificación de licencia para el componente. Estas solían definirse directamente como atributos de ensamblado, pero las trasladé a una clase separada porque en .NET Compact Framework no puedo acceder a los atributos de ensamblado. Ahora el código de licenciamiento, cuando se compila para .NET Compact Framework, usa estas constantes en lugar de los atributos de ensamblado en C++."
type: docs
weight: 100
url: /es/cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


Define los constantes que participan en la verificación de licencia del componente. Estos solían definirse directamente como atributos de ensamblado, pero los trasladé a una clase separada porque en .NET Compact Framework no puedo acceder a los atributos de ensamblado. Ahora el código de licenciamiento, cuando se compila para .NET Compact Framework, utiliza estos constantes en lugar de los atributos de ensamblado.

```cpp
class AssemblyConstants : public System::Object
```

## Campos

| Campo | Descripción |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | El productor de los documentos de salida. |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | Esto se usa en el código de licenciamiento de **Aspose** para verificar que la licencia es para el producto correcto. |
| static [Product2](./product2/) | Esto se usa en el código de licenciamiento de **Aspose** para verificar que la licencia es para el producto correcto. Temporalmente la licencia **Aspose.EPS** será válida también para [Aspose.Page](../). |
| static [Product3](./product3/) | Esto se usa en el código de licenciamiento de **Aspose** para verificar que la licencia es para el producto correcto. Temporalmente la licencia Aspose.XPS será válida también para [Aspose.Page](../). |
| static [ReleaseDate](./releasedate/) | Esto se usa en el código de licenciamiento de **Aspose** para comprobar la expiración de la suscripción. Debes establecer esto a la fecha en que publiques una versión o una corrección. |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | La versión del ensamblado. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
