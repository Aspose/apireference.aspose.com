﻿---
title: RevisionColor enumeration
linktitle: RevisionColor enumeration
articleTitle: RevisionColor enumeration
second_title: Aspose.Words for Python
description: "aspose.words.layout.RevisionColor enumeration. Allows to specify color of document revisions."
type: docs
weight: 100
url: /python-net/aspose.words.layout/revisioncolor/
---

## RevisionColor enumeration

Allows to specify color of document revisions.


### Members

| Name | Description |
| --- | --- |
| AUTO | Default. |
| BLACK | Represents 000000 color. |
| BLUE | Represents 2e97d3 color. |
| BRIGHT_GREEN | Represents 84a35b color. |
| CLASSIC_BLUE | Represents 0000ff color. |
| CLASSIC_RED | Represents ff0000 color. |
| DARK_BLUE | Represents 376e96 color. |
| DARK_RED | Represents 881824 color. |
| DARK_YELLOW | Represents e09a2b color. |
| GRAY25 | Represents a0a3a9 color. |
| GRAY50 | Represents 50565e color. |
| GREEN | Represents 2c6234 color. |
| PINK | Represents ce338f color. |
| RED | Represents b5082e color. |
| TEAL | Represents 1b9cab color. |
| TURQUOISE | Represents 3eafc2 color. |
| VIOLET | Represents 633277 color. |
| WHITE | Represents ffffff color. |
| YELLOW | Represents fad272 color. |
| LIGHT_PINK | Represents fce6f4 color. |
| LIGHT_BLUE | Represents e1f2fa color. |
| LIGHT_YELLOW | Represents fef4de color. |
| LIGHT_PURPLE | Represents eadfef color. |
| LIGHT_ORANGE | Represents fce3d0 color. |
| LIGHT_GREEN | Represents e9f8ce color. |
| GRAY | Represents efeded color. |
| NO_HIGHLIGHT | No color is used to highlight revision changes. |
| BY_AUTHOR | Revisions of each author receive their own color for highlighting from a predefined set of hi-contrast colors. |

### Examples

Shows how to alter the appearance of revisions in a rendered output document.

```python
doc = aw.Document()
builder = aw.DocumentBuilder(doc=doc)
# Insert a revision, then change the color of all revisions to green.
builder.writeln('This is not a revision.')
doc.start_track_revisions(author='John Doe', date_time=datetime.datetime.now())
builder.writeln('This is a revision.')
doc.stop_track_revisions()
builder.writeln('This is not a revision.')
# Remove the bar that appears to the left of every revised line.
doc.layout_options.revision_options.inserted_text_color = aw.layout.RevisionColor.BRIGHT_GREEN
doc.layout_options.revision_options.show_revision_bars = False
doc.layout_options.revision_options.revision_bars_position = aw.drawing.HorizontalAlignment.RIGHT
doc.save(file_name=ARTIFACTS_DIR + 'Revision.LayoutOptionsRevisions.pdf')
```

### See Also

* module [aspose.words.layout](../)

