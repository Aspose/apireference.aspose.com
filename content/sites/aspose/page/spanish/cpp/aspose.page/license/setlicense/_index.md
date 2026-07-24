---
title: "Método SetLicense de Aspose::Page::License"
linktitle: "SetLicense"
second_title: "Aspose.Page para C++"
description: "Método SetLicense de Aspose::Page::License. Licencia el componente en C++."
type: docs
weight: 400
url: /es/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licencia el componente.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| flujo | System::SharedPtr\<System::IO::Stream\> | Un flujo que contiene la licencia. |
## Observaciones



Utilice este método para cargar una licencia desde un flujo.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Licencia el componente.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Observaciones


Intenta encontrar la licencia en las siguientes ubicaciones:

1. Ruta explícita.

<ms>

2. La carpeta del ensamblado del componente.

3. La carpeta del ensamblado que llama el cliente.

4. La carpeta del ensamblado de entrada.

5. Un recurso incrustado en el ensamblado que llama el cliente.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Ruta explícita.

2. Un recurso incrustado en el ensamblado que llama el cliente.

</ms>

<java>

2. La carpeta del archivo jar del componente.

</java>
## Ver también

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
