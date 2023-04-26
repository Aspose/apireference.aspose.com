---
title: Class DocumentInputBin
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin clase. Describe el contenedor de entrada instalado en un dispositivo o la lista completa de contenedores admitidos para un dispositivo. ElJobInputBin DocumentInputBin  yPageInputBin Las palabras clave se excluyen mutuamente. Ambos no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /es/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Describe el contenedor de entrada instalado en un dispositivo o la lista completa de contenedores admitidos para un dispositivo. El[`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , y[`PageInputBin`](../pageinputbin/) Las palabras clave se excluyen mutuamente. Ambos no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

### Ver también

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


