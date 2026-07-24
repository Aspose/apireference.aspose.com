---
title: "Clase Aspose::Page::XPS::XpsMetadata::JobAccountingSheet"
linktitle: "JobAccountingSheet"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsMetadata::JobAccountingSheet. Describe la hoja de contabilidad que se debe generar para el trabajo. La hoja de contabilidad debe emitirse con el PageMediaSize predeterminado y usando el PageMediaType predeterminado. La hoja de contabilidad debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como JobDuplex, JobStaple o JobBinding) no debe incluir la hoja de contabilidad. La hoja de contabilidad puede aparecer como la primera o última página del trabajo a discreción del implementador.  en C++."
type: docs
weight: 4400
url: /es/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


Describe la hoja de contabilidad que se debe generar para el trabajo. La hoja de contabilidad debe generarse con el [PageMediaSize](../pagemediasize/) predeterminado y usando el [PageMediaType](../pagemediatype/) predeterminado. La hoja de contabilidad debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como **JobDuplex**, **JobStaple** o **JobBinding**) no debe incluir la hoja de contabilidad. La hoja de contabilidad puede aparecer como la primera o última página del trabajo a discreción del implementador. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## Métodos

| Método | Descripción |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
