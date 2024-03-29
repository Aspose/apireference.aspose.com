---
title: VbaModule Class
linktitle: VbaModule
articleTitle: VbaModule
second_title: Aspose.Words para .NET
description: Aspose.Words.Vba.VbaModule clase. Proporciona acceso al módulo de proyecto VBA en C#.
type: docs
weight: 6550
url: /es/net/aspose.words.vba/vbamodule/
---
## VbaModule class

Proporciona acceso al módulo de proyecto VBA.

Para obtener más información, visite el[Trabajar con macros VBA](https://docs.aspose.com/words/net/working-with-vba-macros/) artículo de documentación.

```csharp
public class VbaModule
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [VbaModule](vbamodule/)() | Crea un módulo vacío. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.words.vba/vbamodule/name/) { get; set; } | Obtiene o establece el nombre del módulo del proyecto VBA. |
| [SourceCode](../../aspose.words.vba/vbamodule/sourcecode/) { get; set; } | Obtiene o establece el código fuente del módulo de proyecto VBA. |
| [Type](../../aspose.words.vba/vbamodule/type/) { get; set; } | Especifica si el módulo es un módulo de procedimiento, un módulo de documento, un módulo de clase o un módulo de diseñador. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../aspose.words.vba/vbamodule/clone/)() | Realiza una copia del`VbaModule` . |

## Ejemplos

Muestra cómo acceder a la información del proyecto VBA de un documento.

```csharp
Document doc = new Document(MyDir + "VBA project.docm");

// Un proyecto VBA contiene una colección de módulos VBA.
VbaProject vbaProject = doc.VbaProject;
Console.WriteLine(vbaProject.IsSigned
    ? $"Project name: {vbaProject.Name} signed; Project code page: {vbaProject.CodePage}; Modules count: {vbaProject.Modules.Count()}\n"
    : $"Project name: {vbaProject.Name} not signed; Project code page: {vbaProject.CodePage}; Modules count: {vbaProject.Modules.Count()}\n");

VbaModuleCollection vbaModules = doc.VbaProject.Modules; 

Assert.AreEqual(vbaModules.Count(), 3);

foreach (VbaModule module in vbaModules)
    Console.WriteLine($"Module name: {module.Name};\nModule code:\n{module.SourceCode}\n");

// Establece un nuevo código fuente para el módulo VBA. Puede acceder a los módulos VBA de la colección por índice o por nombre.
vbaModules[0].SourceCode = "Your VBA code...";
vbaModules["Module1"].SourceCode = "Your VBA code...";

// Eliminar un módulo de la colección.
vbaModules.Remove(vbaModules[2]);
```

### Ver también

* espacio de nombres [Aspose.Words.Vba](../../aspose.words.vba/)
* asamblea [Aspose.Words](../../)
