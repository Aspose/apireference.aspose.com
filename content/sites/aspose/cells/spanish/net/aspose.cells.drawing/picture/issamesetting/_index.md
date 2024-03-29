---
title: IsSameSetting
second_title: Referencia de API de Aspose.Cells para .NET
description: Devuelve si la forma es la misma.
type: docs
weight: 190
url: /es/net/aspose.cells.drawing/picture/issamesetting/
---
## Picture.IsSameSetting method

Devuelve si la forma es la misma.

```csharp
public override bool IsSameSetting(object obj)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| obj | Object |  |

### Ejemplos

```csharp

[C#]
// Instanciando un objeto Workbook
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];
//insertar primera imagen
int imgIndex1 = worksheet.Pictures.Add(1, 1, "1.png");
//Obtener el objeto de imagen insertado
Picture pic1 = worksheet.Pictures[imgIndex1];
//insertar segunda imagen
int imgIndex2 = worksheet.Pictures.Add(1, 9, "2.jpeg");
//Obtener el objeto de imagen insertado
Picture pic2 = worksheet.Pictures[imgIndex2];
if(pic1.IsSameSetting(pic1))
{
    //dos objetos de imagen son iguales.
}

if(!pic1.IsSameSetting(pic2))
{
    //dos objetos de imagen no son iguales.
}
```

### Ver también

* class [Picture](../../picture)
* espacio de nombres [Aspose.Cells.Drawing](../../picture)
* asamblea [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
