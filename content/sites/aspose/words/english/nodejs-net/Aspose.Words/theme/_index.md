﻿---
title: Theme class
linktitle: Theme class
articleTitle: Theme class
second_title: Aspose.Words for Node.js
description: "Aspose.Words.Theme class. Represents document Theme, and provides access to main theme parts including [Theme.majorFonts](./majorFonts/), [Theme.minorFonts](./minorFonts/) and [Theme.colors](./colors/) To learn more, visit the [Working with Styles and Themes](https://docs.aspose.com/words/nodejs-net/working-with-styles-and-themes/) documentation article."
type: docs
weight: 1410
url: /nodejs-net/aspose.words/theme/
---

## Theme class

Represents document Theme, and provides access to main theme parts including [Theme.majorFonts](./majorFonts/), [Theme.minorFonts](./minorFonts/) and [Theme.colors](./colors/)
To learn more, visit the [Working with Styles and Themes](https://docs.aspose.com/words/nodejs-net/working-with-styles-and-themes/) documentation article.




### Constructors
| Name | Description |
| --- | --- |
| [Theme()](./constructor/#default) | The default constructor. |

### Properties

| Name | Description |
| --- | --- |
| [colors](./colors/) | Allows to specify the set of theme colors for the document. |
| [majorFonts](./majorFonts/) | Allows to specify the set of major fonts for different languages. |
| [minorFonts](./minorFonts/) | Allows to specify the set of minor fonts for different languages. |

### Examples

Shows how to set custom colors and fonts for themes.

```js
let doc = new aw.Document(base.myDir + "Theme colors.docx");

// The "Theme" object gives us access to the document theme, a source of default fonts and colors.
let theme = doc.theme;

// Some styles, such as "Heading 1" and "Subtitle", will inherit these fonts.
theme.majorFonts.latin = "Courier New";
theme.minorFonts.latin = "Agency FB";

// Other languages may also have their custom fonts in this theme.
expect(theme.majorFonts.complexScript).toEqual('');
expect(theme.majorFonts.eastAsian).toEqual('');
expect(theme.minorFonts.complexScript).toEqual('');
expect(theme.minorFonts.eastAsian).toEqual('');

// The "Colors" property contains the color palette from Microsoft Word,
// which appears when changing shading or font color.
// Apply custom colors to the color palette so we have easy access to them in Microsoft Word
// when we, for example, change the font color via "Home" -> "Font" -> "Font Color",
// or insert a shape, and then set a color for it via "Shape Format" -> "Shape Styles".
let colors = theme.colors;
colors.dark1 = "#191970";
colors.light1 = "#98FB98";
colors.dark2 = "#4B0082";
colors.light2 = "#F0E68C";

colors.accent1 = "#FF4500";
colors.accent2 = "#FFA07A";
colors.accent3 = "#FFFF00";
colors.accent4 = "#FFD700";
colors.accent5 = "#8A2BE2";
colors.accent6 = "#9400D3";

// Apply custom colors to hyperlinks in their clicked and un-clicked states.
colors.hyperlink = "#000000";
colors.followedHyperlink = "#808080";

doc.save(base.artifactsDir + "Themes.CustomColorsAndFonts.docx");
```

### See Also

* module [Aspose.Words](../)

