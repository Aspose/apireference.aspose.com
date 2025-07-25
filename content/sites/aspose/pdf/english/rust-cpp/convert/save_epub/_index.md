---
title: "save_epub"
second_title: Aspose.PDF for Rust via C++
description: "Converts and saves the previously opened PDF-document as an EPUB-document."
type: docs
url: /rust-cpp/convert/save_epub/
---

_Converts and saves the previously opened PDF-document as an EPUB-document._

```rust
pub fn save_epub(&self, filename: &str) -> Result<(), PdfError>
```

**Arguments**
  * **filename** – the path to the output file

**Returns**
  * **Ok(())** - if the operation succeeds
  * **Err(PdfError)** - if the operation fails

**Example**

```rust
use asposepdf::Document;

fn main() -> Result<(), Box<dyn std::error::Error>> {
    // Open a PDF-document with filename
    let pdf = Document::open("sample.pdf")?;

    // Convert and save the previously opened PDF-document as Epub-document
    pdf.save_epub("sample.epub")?;

    Ok(())
}

```