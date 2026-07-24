---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet clase"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet clase. Describe la salida de la hoja de error. Todo el trabajo tendrá una única hoja de error. La hoja de error debe imprimirse con el PageMediaSize predeterminado y usando el PageMediaType predeterminado. La hoja de error debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como JobDuplex, JobStaple o JobBinding) no debe incluir la hoja de error. La hoja de error debe aparecer como la hoja final del trabajo.  en C++."
type: docs
weight: 5300
url: /es/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Describe la salida de la hoja de error. Todo el trabajo tendrá una única hoja de error. La hoja de error debe imprimirse con el [PageMediaSize](../pagemediasize/) predeterminado y usando el [PageMediaType](../pagemediatype/) predeterminado. La hoja de error debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como **JobDuplex**, **JobStaple**, o **JobBinding**) no debe incluir la hoja de error. La hoja de error debe aparecer como la hoja final del trabajo. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Métodos

| Método | Descripción |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
