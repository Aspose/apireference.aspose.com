﻿---
title: OdtSaveOptions.is_strict_schema11 property
linktitle: is_strict_schema11 property
articleTitle: is_strict_schema11 property
second_title: Aspose.Words for Python
description: "OdtSaveOptions.is_strict_schema11 property. Specifies whether export should correspond to ODT specification 1.1 strictly"
type: docs
weight: 30
url: /python-net/aspose.words.saving/odtsaveoptions/is_strict_schema11/
---

## OdtSaveOptions.is_strict_schema11 property

Specifies whether export should correspond to ODT specification 1.1 strictly.
OOo 3.0 displays files correctly when they contain elements and attributes of ODT 1.2.
Use "false" for this purpose, or "true" for strict conformity of specification 1.1.
The default value is ``False``.



```python
@property
def is_strict_schema11(self) -> bool:
    ...

@is_strict_schema11.setter
def is_strict_schema11(self, value: bool):
    ...

```

### Examples

Shows how to make a saved document conform to an older ODT schema.

```python
doc = aw.Document(file_name=MY_DIR + 'Rendering.docx')
save_options = aw.saving.OdtSaveOptions()
save_options.measure_unit = aw.saving.OdtSaveMeasureUnit.CENTIMETERS
save_options.is_strict_schema11 = export_to_odt_11_specs
doc.save(file_name=ARTIFACTS_DIR + 'OdtSaveOptions.Odt11Schema.odt', save_options=save_options)
```

### See Also

* module [aspose.words.saving](../../)
* class [OdtSaveOptions](../)

