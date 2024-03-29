﻿---
title: BookmarkStart.accept method
linktitle: accept method
articleTitle: accept method
second_title: Aspose.Words for Python
description: "BookmarkStart.accept method. Accepts a visitor."
type: docs
weight: 50
url: /python-net/aspose.words/bookmarkstart/accept/
---

## accept(visitor) {#documentvisitor}

Accepts a visitor.


```python
def accept(self, visitor: aspose.words.DocumentVisitor):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| visitor | [DocumentVisitor](../../documentvisitor/) | The visitor that will visit the node. |

### Remarks

Calls [DocumentVisitor.visit_bookmark_start()](../../documentvisitor/visit_bookmark_start/#bookmarkstart).

For more info see the Visitor design pattern.




### Returns

``False`` if the visitor requested the enumeration to stop.


### See Also

* module [aspose.words](../../)
* class [BookmarkStart](../)

