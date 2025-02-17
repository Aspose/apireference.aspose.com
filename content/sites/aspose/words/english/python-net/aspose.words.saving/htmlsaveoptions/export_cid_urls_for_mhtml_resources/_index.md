﻿---
title: HtmlSaveOptions.export_cid_urls_for_mhtml_resources property
linktitle: export_cid_urls_for_mhtml_resources property
articleTitle: export_cid_urls_for_mhtml_resources property
second_title: Aspose.Words for Python
description: "HtmlSaveOptions.export_cid_urls_for_mhtml_resources property. Specifies whether to use CID (Content-ID) URLs to reference resources (images, fonts, CSS) included in MHTML documents"
type: docs
weight: 110
url: /python-net/aspose.words.saving/htmlsaveoptions/export_cid_urls_for_mhtml_resources/
---

## HtmlSaveOptions.export_cid_urls_for_mhtml_resources property

Specifies whether to use CID (Content-ID) URLs to reference resources (images, fonts, CSS) included in MHTML
documents. Default value is ``False``.



```python
@property
def export_cid_urls_for_mhtml_resources(self) -> bool:
    ...

@export_cid_urls_for_mhtml_resources.setter
def export_cid_urls_for_mhtml_resources(self, value: bool):
    ...

```

### Remarks

This option affects only documents being saved to MHTML.

By default, resources in MHTML documents are referenced by file name (for example, "image.png"), which
are matched against "Content-Location" headers of MIME parts.

This option enables an alternative method, where references to resource files are written as CID (Content-ID)
URLs (for example, "cid:image.png") and are matched against "Content-ID" headers.

In theory, there should be no difference between the two referencing methods and either of them should work
fine in any browser or mail agent. In practice, however, some agents fail to fetch resources by file name. If your
browser or mail agent refuses to load resources included in an MTHML document (doesn't show images or doesn't load
CSS styles), try exporting the document with CID URLs.




### Examples

Shows how to enable content IDs for output MHTML documents.

```python
doc = aw.Document(file_name=MY_DIR + 'Rendering.docx')
# Setting this flag will replace "Content-Location" tags
# with "Content-ID" tags for each resource from the input document.
options = aw.saving.HtmlSaveOptions(aw.SaveFormat.MHTML)
options.export_cid_urls_for_mhtml_resources = export_cid_urls_for_mhtml_resources
options.css_style_sheet_type = aw.saving.CssStyleSheetType.EXTERNAL
options.export_font_resources = True
options.pretty_format = True
doc.save(file_name=ARTIFACTS_DIR + 'HtmlSaveOptions.ContentIdUrls.mht', save_options=options)
out_doc_contents = system_helper.io.File.read_all_text(ARTIFACTS_DIR + 'HtmlSaveOptions.ContentIdUrls.mht')
if export_cid_urls_for_mhtml_resources:
    self.assertTrue('Content-ID: <document.html>' in out_doc_contents)
    self.assertTrue('<link href=3D"cid:styles.css" type=3D"text/css" rel=3D"stylesheet" />' in out_doc_contents)
    self.assertTrue("@font-face { font-family:'Arial Black'; font-weight:bold; src:url('cid:arib=\r\nlk.ttf') }" in out_doc_contents)
    self.assertTrue('<img src=3D"cid:image.003.jpeg" width=3D"350" height=3D"180" alt=3D"" />' in out_doc_contents)
else:
    self.assertTrue('Content-Location: document.html' in out_doc_contents)
    self.assertTrue('<link href=3D"styles.css" type=3D"text/css" rel=3D"stylesheet" />' in out_doc_contents)
    self.assertTrue("@font-face { font-family:'Arial Black'; font-weight:bold; src:url('ariblk.t=\r\ntf') }" in out_doc_contents)
    self.assertTrue('<img src=3D"image.003.jpeg" width=3D"350" height=3D"180" alt=3D"" />' in out_doc_contents)
```

### See Also

* module [aspose.words.saving](../../)
* class [HtmlSaveOptions](../)

