---
title: Aspose.Font.CffDataProviders
second_title: Aspose.Font for .NET API Reference
description: The Aspose.Font.CffDataProviders namespace provides classes used to retrieve and update data from various CFF structures
type: docs
weight: 30
url: /net/aspose.font.cffdataproviders/
---
The **Aspose.Font.CffDataProviders** namespace provides classes used to retrieve and update data from various CFF structures.

## Classes

| Class | Description |
| --- | --- |
| [NameIndexDataProvider](./nameindexdataprovider/) | Declares functionality to access CFF Name INDEX structure. |
| [StringIndexDataProvider](./stringindexdataprovider/) | Declares functionality to access CFF String INDEX structure. |
## Interfaces

| Interface | Description |
| --- | --- |
| [ICffIndexDataProvider](./icffindexdataprovider/) | Basic interface for accessing INDEX structures of CFF fonts. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [CffIndexProviderType](./cffindexprovidertype/) | Specifies INDEX structures supported by the index provider interface family. |
| [CffUpdateStringIndexStrategy](./cffupdatestringindexstrategy/) | Specifies how to add strings to CFF String INDEX storage. When we try to add some string into CFF String INDEX, there may be situation that this string is already present in String INDEX. Using option SearchForDuplicates we can force search over String INDEX to detect whether this string is already present or not. This approach saves space in the String INDEX structure, but requires more time to add the string. |


