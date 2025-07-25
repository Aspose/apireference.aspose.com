---
title: "Aspose.PDF for Rust via C++"
description:  "Aspose.PDF for Rust via C++"
keywords:  "Rust, PDF, PDF toolkit, pdf, convert, processing"
tags: ['pdf-to-jpg', 'pdf-to-png', 'pdf-convert', 'pdf-tools']
weight: 40
url: /rust-cpp/
type: docs
is_root: true
---

> Aspose.PDF for Rust via C++ allows developers manipulate them PDF files directly in the Rust.

# Structs

## Document
Document represents a PDF-document.

```rust
pub struct Document { /* private fields */ }
```

# Implementations

## Convert from PDF functions

| Function | Description |
| -------- | ----------- |
| [save_docx](./convert/save_docx/) | Convert and save the previously opened PDF-document as DocX-document. |
| [save_doc](./convert/save_doc/) | Convert and save the previously opened PDF-document as Doc-document. |
| [save_xlsx](./convert/save_xlsx/) | Convert and save the previously opened PDF-document as XlsX-document. |
| [save_txt](./convert/save_txt/) | Convert and save the previously opened PDF-document as Txt-document. |
| [save_pptx](./convert/save_pptx/) | Convert and save the previously opened PDF-document as PptX-document. |
| [save_xps](./convert/save_xps/) | Convert and save the previously opened PDF-document as Xps-document. |
| [save_tex](./convert/save_tex/) | Convert and save the previously opened PDF-document as TeX-document. |
| [save_epub](./convert/save_epub/) | Convert and save the previously opened PDF-document as Epub-document. |
| [save_booklet](./convert/save_booklet/) | Convert and save the previously opened PDF-document as booklet PDF-document. |
| [save_n_up](./convert/save_n_up/) | Convert and save the previously opened PDF-document as N-Up PDF-document. |
| [save_markdown](./convert/save_markdown/) | Convert and save the previously opened PDF-document as Markdown-document. |
| [save_tiff](./convert/save_tiff/) | Convert and save the previously opened PDF-document as Tiff-document. |
| [page_to_jpg](./convert/page_to_jpg/) | Convert and save the specified page as Jpg-image. |
| [page_to_png](./convert/page_to_png/) | Convert and save the specified page as Png-image. |
| [page_to_bmp](./convert/page_to_bmp/) | Convert and save the specified page as Bmp-image. |
| [page_to_tiff](./convert/page_to_tiff/) | Convert and save the specified page as Tiff-image. |
| [page_to_svg](./convert/page_to_svg/) | Convert and save the specified page as Svg-image. |
| [page_to_pdf](./convert/page_to_pdf/) | Convert and save the specified page as PDF-document. |
| [page_to_dicom](./convert/page_to_dicom/) | Convert and save the specified page as DICOM-image. |


## Organize PDF functions

| Function | Description |
| -------- | ----------- |
| [optimize](./organize/optimize/) | Optimize PDF-document content. |
| [optimize_resource](./organize/optimize_resource/) | Optimize resources of PDF-document. |
| [grayscale](./organize/grayscale/) | Convert PDF-document to black and white. |
| [rotate](./organize/rotate/) | Rotate PDF-document. |
| [set_background](./organize/set_background/) | Set PDF-document background color using RGB values. |
| [repair](./organize/repair/) | Repair PDF-document. |
| [page_rotate](./organize/page_rotate/) | Rotate a page in the PDF-document. |
| [page_set_size](./organize/page_set_size/) | Set the size of a page in the PDF-document. |
| [page_grayscale](./organize/page_grayscale/) | Convert page to black and white. |
| [page_add_text](./organize/page_add_text/) | Add text on page. |


## Core PDF functions

| Function | Description |
| -------- | ----------- |
| [new](./core/new/) | Create a new PDF-document. |
| [open](./core/open/) | Open a PDF-document with filename. |
| [save](./core/save/) | Save the previously opened PDF-document. |
| [save_as](./core/save_as/) | Save the previously opened PDF-document with new filename. |
| [set_license](./core/set_license/) | Set license with filename. |
| [extract_text](./core/extract_text/) | Return the PDF-document contents as plain text. |
| [page_add](./core/page_add/) | Add new page in PDF-document. |
| [page_insert](./core/page_insert/) | Insert new page at the specified position in PDF-document. |
| [page_delete](./core/page_delete/) | Delete specified page in PDF-document. |
| [page_count](./core/page_count/) | Return the number of pages in the PDF-document. |


# Enums

## Enumeration of possible page size values.
```rust
pub enum PageSize {
    /// A0 size.
    A0 = 0,
    /// A1 size.
    A1 = 1,
    /// A2 size.
    A2 = 2,
    /// A3 size.
    A3 = 3,
    /// A4 size.
    A4 = 4,
    /// A5 size.
    A5 = 5,
    /// A6 size.
    A6 = 6,
    /// B5 size.
    B5 = 7,
    /// PageLetter size.
    PageLetter = 8,
    /// PageLegal size.
    PageLegal = 9,
    /// PageLedger size.
    PageLedger = 10,
    /// P11x17 size.
    P11x17 = 11,
}
```

## Enumeration of possible rotation values.
```rust
pub enum Rotation {
    /// Non-rotated.
    None = 0,
    /// Rotated on 90 degrees clockwise.
    On90 = 1,
    /// Rotated on 180 degrees.
    On180 = 2,
    /// Rotated on 270 degrees clockwise.
    On270 = 3,
    /// Rotated on 360 degrees clockwise.
    On360 = 4,
}
```

