﻿---
title: PdfSaveOptions.header_footer_bookmarks_export_mode property
linktitle: header_footer_bookmarks_export_mode property
articleTitle: header_footer_bookmarks_export_mode property
second_title: Aspose.Words for Python
description: "PdfSaveOptions.header_footer_bookmarks_export_mode property. Determines how bookmarks in headers/footers are exported."
type: docs
weight: 190
url: /python-net/aspose.words.saving/pdfsaveoptions/header_footer_bookmarks_export_mode/
---

## PdfSaveOptions.header_footer_bookmarks_export_mode property

Determines how bookmarks in headers/footers are exported.


```python
@property
def header_footer_bookmarks_export_mode(self) -> aspose.words.saving.HeaderFooterBookmarksExportMode:
    ...

@header_footer_bookmarks_export_mode.setter
def header_footer_bookmarks_export_mode(self, value: aspose.words.saving.HeaderFooterBookmarksExportMode):
    ...

```

### Remarks

The default value is [HeaderFooterBookmarksExportMode.ALL](../../headerfooterbookmarksexportmode/#ALL).

This property is used in conjunction with the [PdfSaveOptions.outline_options](../outline_options/) option.




### Examples

Shows to process bookmarks in headers/footers in a document that we are rendering to PDF.

```python
doc = aw.Document(file_name=MY_DIR + 'Bookmarks in headers and footers.docx')
# Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
# to modify how that method converts the document to .PDF.
save_options = aw.saving.PdfSaveOptions()
# Set the "PageMode" property to "PdfPageMode.UseOutlines" to display the outline navigation pane in the output PDF.
save_options.page_mode = aw.saving.PdfPageMode.USE_OUTLINES
# Set the "DefaultBookmarksOutlineLevel" property to "1" to display all
# bookmarks at the first level of the outline in the output PDF.
save_options.outline_options.default_bookmarks_outline_level = 1
# Set the "HeaderFooterBookmarksExportMode" property to "HeaderFooterBookmarksExportMode.None" to
# not export any bookmarks that are inside headers/footers.
# Set the "HeaderFooterBookmarksExportMode" property to "HeaderFooterBookmarksExportMode.First" to
# only export bookmarks in the first section's header/footers.
# Set the "HeaderFooterBookmarksExportMode" property to "HeaderFooterBookmarksExportMode.All" to
# export bookmarks that are in all headers/footers.
save_options.header_footer_bookmarks_export_mode = header_footer_bookmarks_export_mode
doc.save(file_name=ARTIFACTS_DIR + 'PdfSaveOptions.HeaderFooterBookmarksExportMode.pdf', save_options=save_options)
```

### See Also

* module [aspose.words.saving](../../)
* class [PdfSaveOptions](../)

