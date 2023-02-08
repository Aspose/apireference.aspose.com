---
title: ParameterRef
second_title: Aspose.Page for Java API Reference
description: The class that implements a common PrintTicket parameter reference.
type: docs
weight: 140
url: /java/com.aspose.xps.metadata/parameterref/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem)
```
public class ParameterRef extends PrintTicketElement implements IPrintTicketItem
```

The class that implements a common PrintTicket parameter reference. A \`\`\` ParameterRef \`\`\` element defines a reference to a \`\`\` ParameterInit \`\`\` element. A \`\`\` ScoredProperty \`\`\` element that contains a ParameterRef element does not have an explicitly-set \`\`\` Value \`\`\` element. Instead, the \`\`\` ScoredProperty \`\`\` element receives its value from the \`\`\` ParameterInit \`\`\` element referenced by a \`\`\` ParameterRef \`\`\` element. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterref
## Constructors

| Constructor | Description |
| --- | --- |
| [ParameterRef(String name)](#ParameterRef-java.lang.String-) | Creates a new instance. |
### ParameterRef(String name) {#ParameterRef-java.lang.String-}
```
public ParameterRef(String name)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | A parameter name. |

