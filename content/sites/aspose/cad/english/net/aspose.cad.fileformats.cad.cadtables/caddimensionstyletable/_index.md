---
title: Class CadDimensionStyleTable
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Cad.CadTables.CadDimensionStyleTable class. The Cad dimension style table
type: docs
weight: 4330
url: /net/aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/
---
## CadDimensionStyleTable class

The Cad dimension style table.

```csharp
public class CadDimensionStyleTable : CadOwnedObjectBase
```

## Constructors

| Name | Description |
| --- | --- |
| [CadDimensionStyleTable](caddimensionstyletable/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [ApplicationCodesContainer](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/applicationcodescontainer/) { get; set; } | Gets or sets the application defined codes container. |
| [Attribute102Values](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/attribute102values/) { get; set; } | Gets or sets the attribute102 values. |
| [Attributes](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/attributes/) { get; set; } | Gets or sets the attributes. |
| [Dimadec](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimadec/) { get; set; } | Gets or sets the number of precision places displayed in angular dimensions. |
| [Dimalt](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimalt/) { get; set; } | Gets or sets the mode for displaying alternate units in dimension. If value is 0 alternate units are off, if the value is 1 alternate units are on. |
| [Dimaltd](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaltd/) { get; set; } | Gets or sets the number of decimal places in alternate units. If Dimalt is turned on, this value sets the number of digits displayed after the decimal point. |
| [Dimaltf](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaltf/) { get; set; } | Gets or sets the multiplier for the alternate units. If Dimalt is turned on, this value sets the factor of multiplying linear dimensions. Represents the number of millimeters in an inch. |
| [DimAltMzf](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaltmzf/) { get; set; } | Gets or sets alternate sub-zero factor for dimensions. |
| [DimAltMzs](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaltmzs/) { get; set; } | Gets or sets alternate sub-zero suffix for dimensions. |
| [Dimaltrnd](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaltrnd/) { get; set; } | Gets or sets the rounding value for the alternate units, e.g., 0.0000. |
| [Dimalttd](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimalttd/) { get; set; } | Gets or sets the number of decimal places for the tolerance values in the alternate units of a dimension. |
| [Dimalttz](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimalttz/) { get; set; } | Gets or sets the mode for alternate tolerance zero suppression. |
| [Dimaltu](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaltu/) { get; set; } | Gets or sets the format for alternate units of all dimension styles (except angular). |
| [Dimaltz](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaltz/) { get; set; } | Gets or sets the suppression of zeros for alternate unit dimension values. |
| [Dimapost](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimapost/) { get; set; } | Gets or sets a text prefix and/or suffix to the alternate dimension test for all dimensions styles (except angular). |
| [Dimarcsym](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimarcsym/) { get; set; } | Gets or sets the mode to display arc symbols for arc length dimension. Possible values are: 0 (the arc length symbol is before the text of dimension), 1 (the arc length symbol is above the text of dimension), 2 (the arc length symbol is not shown). |
| [Dimasz](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimasz/) { get; set; } | Gets or sets the size of dimension arrowheads. Applicable only when Dimtsz is 0. |
| [Dimatfit](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimatfit/) { get; set; } | Gets or sets the mode for the arranging dimension text and arrows when there is not enough space. Possible values are: 0 (text and arrows will be outside extension lines), 1 (arrows will be moved first), 2 (text will be moved first), 3 (the best move of arrows or text will be applied). |
| [Dimaunit](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimaunit/) { get; set; } | Gets or sets the units for angular dimensions. Possible values are: 0 (decimal degrees), 1 (degrees/minutes/seconds), 2 (gradians), 3 (radians). |
| [Dimazin](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimazin/) { get; set; } | Gets or sets the mode to suppress zeros for angular dimensions. Possible values are: 0 (displays all zeros), 1 (suppresses leading zeros), 2 (suppresses trailing zeros), 3 (suppresses leading and trailing zeros). |
| [Dimblk](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimblk/) { get; set; } | Gets or sets the arrowhead block name used at the ends of dimension lines. Valid standard names are ".", "_DOT", "_DOTSMALL", "_DOTBLANK", "_ORIGIN", "_ORIGIN2", "_OPEN", "_OPEN90", "_OPEN30", "_CLOSED", "_SMALL", "_NONE", "_OBLIQUE", "_BOXFILLED", "_BOXBLANK", "_CLOSEDBLANK","_DATUMFILLED", "_DATUMBLANK", "_INTEGRAL", "_ARCHTICK". |
| [Dimblk1](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimblk1/) { get; set; } | Gets or sets the arrowhead for the first dimension line if Dimsah is 1. |
| [Dimblk1Handle](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimblk1handle/) { get; set; } | Gets or sets the handle for the block referenced by Dimblk1. |
| [Dimblk2](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimblk2/) { get; set; } | Gets or sets the arrowhead for the second dimension line if Dimsah is 1. |
| [Dimblk2Handle](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimblk2handle/) { get; set; } | Gets or sets the handle for the block referenced by Dimblk2. |
| [DimblkHandle](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimblkhandle/) { get; set; } | Gets or sets the handle for the block referenced by Dimblk. |
| [Dimcen](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimcen/) { get; set; } | Gets or sets the mode of drawing arc/circle center marks and centerlines. If the value is 0 no center marks are drawn, if negative cernterlines are drawn, if positive center marks are drawn. |
| [Dimclrd](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimclrd/) { get; set; } | Gets or sets color to dimension lines, arrowheads, and dimension leader lines. Possible values are 1-225 (color index), 0 - by block, 256 - by layer. |
| [Dimclre](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimclre/) { get; set; } | Gets or sets color to dimension extension lines. Possible values are 1-225 (color index), 0 - by block, 256 - by layer. |
| [Dimclrt](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimclrt/) { get; set; } | Gets or sets color to dimension text. Possible values are 1-225 (color index), 0 - by block, 256 - by layer. |
| [Dimdec](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimdec/) { get; set; } | Gets or sets the number of decimal places displayed for the primary units of a dimension. |
| [Dimdle](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimdle/) { get; set; } | Gets or sets the distance the dimension line extends beyond the extension line. Applied when oblique strokes (not arrowheads) are drawn. |
| [Dimdli](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimdli/) { get; set; } | Gets or sets the spacing of the dimension lines in baseline dimensions. Each dimension line is offset from the previous one by this value, if necessary, to avoid drawing over it. |
| [Dimdsep](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimdsep/) { get; set; } | Gets or sets a decimal separator. Decimal point is used be default. |
| [Dimexe](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimexe/) { get; set; } | Gets or sets the distance between extension line and dimension line. |
| [Dimexo](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimexo/) { get; set; } | Gets or sets the distance between extension lines and origin points. |
| [Dimfit](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimfit/) { get; set; } | Gets or sets the combination of Dimatfit and Dimtmove. If this value is in range 0 – 3, then Dimatfit is also set to 0 – 3 and Dumtmove is set to 0. It this value is 4 or 5, then Dimatfit is 3 and Dimtmove is 1 or 2. |
| [Dimfrac](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimfrac/) { get; set; } | Gets or sets the fraction mode for architectural or fractional units (Dimlunit). Possible values are 0 (horizontal stacking), 1 (diagonal stacking), 2 (no stacking). |
| [Dimfxl](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimfxl/) { get; set; } |  |
| [Dimfxlon](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimfxlon/) { get; set; } | Gets or sets whether the lengths of the extension are fixed. If the value is true (1), the lengths of the extension lines are set in DIMFXL. |
| [Dimgap](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimgap/) { get; set; } | Gets or sets the distance around the dimension text when the dimension line breaks it. |
| [Dimjogang](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimjogang/) { get; set; } | Gets or sets the angle of the transverse segment of the dimension line in a jogged radius dimension. |
| [Dimjust](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimjust/) { get; set; } | Gets or sets the mode for horizontal positioning of text. Possible values are: 0 (text is above the dimension line and centered between the extension lines), 1 (the text is next to the first extension line), 2 (the text is next to the second extension line), 3 (the text is above and aligned with the first extension line), 4 (the text is above and aligned with the second extension line). |
| [Dimldrblk](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimldrblk/) { get; set; } | Gets or sets the arrow type for leaders. The list of available values is the same as for Dimblk. |
| [Dimlfac](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimlfac/) { get; set; } | Gets or sets a scale factor for linear dimension measurements. |
| [Dimlim](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimlim/) { get; set; } | Gets or sets dimension limits as the default text. Possible values are: 0 (limits are not generated as default text), 1 (limits are generated as default text). If this value is 1 Dimtol value is considered as off. |
| [Dimlunit](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimlunit/) { get; set; } | Gets or sets units mode (not applied to angular dimensions). Possible values are: 1 (scientific), 2 (decimal), 3 (engineering), 4 (architectural stacked), 5 (fractional stacked), 6 (Microsoft Windows Desktop). |
| [Dimlwd](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimlwd/) { get; set; } | Gets or sets the lineweight of dimension lines. Possible values are: -3 (default LWDEFAULT value), -2 (by block), -1 (by layer). |
| [Dimlwe](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimlwe/) { get; set; } | Gets or sets the lineweight of extension lines. Possible values are: -3 (default LWDEFAULT value), -2 (by block), -1 (by layer). |
| [DimMzf](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimmzf/) { get; set; } | Gets or sets sub-zero factor for dimensions. |
| [DimMzs](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimmzs/) { get; set; } | Gets or sets sub-zero suffix for dimensions. |
| [Dimpost](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimpost/) { get; set; } |  |
| [Dimrnd](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimrnd/) { get; set; } | Gets or sets rounding precision for dimension distance (except angular dimensions). |
| [Dimsah](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimsah/) { get; set; } | Gets or sets which arrowhead bocks should be used. If the value is 0 the arrowheads set up by Dimblk are used, if the value is 1 the arrwheads from Dimblk1 and Dimblk2 are used. |
| [Dimscale](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimscale/) { get; set; } | Gets or sets the scale of the dimension. Applicable to the sizes, distances, and offsets but not to the measured lengths, coordinates, and angles. |
| [Dimsd1](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimsd1/) { get; set; } | Gets or sets the suppression of the first dimension line and arrowhead. Possible values are: 0 (not suppressed), 1 (suppressed). |
| [Dimsd2](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimsd2/) { get; set; } | Gets or sets the suppression of the second dimension line and arrowhead. Possible values are: 0 (not suppressed), 1 (suppressed). |
| [Dimse1](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimse1/) { get; set; } | Gets or sets the suppression of the first extension line. Possible values are: 0 (not suppressed), 1 (suppressed). |
| [Dimse2](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimse2/) { get; set; } | Gets or sets the suppression of the second extension line. Possible values are: 0 (not suppressed), 1 (suppressed). |
| [Dimsoxd](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimsoxd/) { get; set; } | Gets or sets the suppression of arrowheads if there is not enough space inside the extension lines. Possible values are: 0 (not suppressed), 1 (suppressed). |
| [Dimtad](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtad/) { get; set; } | Gets or sets the mode for vertical position of text in relation to the dimension line. Possible values are: 0 (centered between the extension lines), 1 (above the dimension line), 2 (on the side of the dimension line farthest away from the defining points), 3 (position is according to Japanese Industrial Standards (JIS)), 4 (below the dimension line). |
| [Dimtdec](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtdec/) { get; set; } | Gets or sets the number of decimal places to display in tolerance values for the primary units in a dimension. Applicable only when Dimtol is on. |
| [Dimtfac](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtfac/) { get; set; } | Gets or sets a scale factor for the text height of fractions and tolerance values relative to the dimension text height. |
| [Dimtfill](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtfill/) { get; set; } | Gets or sets the fill background of dimension text. Possible values are: 0 (no background), 1 (the background color of the drawing), 2 (the color specified by Dimtfillclr). |
| [Dimtih](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtih/) { get; set; } | Gets or sets the position of dimension text inside the extension lines (except ordinate dimensions). Possible values are: 0 (aligns text with the dimension line), 1 (horizontal text). |
| [Dimtix](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtix/) { get; set; } | Gets or sets whether text should be drawn between extension lines. Possible values are: 0 (text is inside the extension lines), 1 (text is between the extension lines even if it would ordinarily be placed outside those lines). |
| [Dimtm](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtm/) { get; set; } | Gets or sets the minimum tolerance limit for dimension text. Applied when Dimtol or Dimlim is on. |
| [Dimtmove](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtmove/) { get; set; } | Gets or sets the mode for dimension text movement. Possible values are: 0 (move the dimension line with dimension text), 1 (Add a leader when dimension text is moved), 2 (move text freely). |
| [Dimtofl](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtofl/) { get; set; } | Gets or sets the mode to draw a dimension line between the extension lines even when the text is placed outside. Possible values are: 0 (do not draw dimension lines between the measured points), 1 (draw dimension lines between the measured points). |
| [Dimtoh](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtoh/) { get; set; } | Gets or sets the position of dimension text outside the extension lines. Possible values are: 0 (align text with the dimension line), 1 (text is horizontal). |
| [Dimtol](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtol/) { get; set; } | Gets or sets whether tolerances should be added to dimension text. Possible values are: 0 (off), 1 (on, Dimlim is considered as off). |
| [Dimtolj](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtolj/) { get; set; } | Gets or sets the vertical justification for tolerance values relative to the text. Possible values are: 0 (bottom), 1 (middle), 2 (top). |
| [Dimtp](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtp/) { get; set; } | Gets or sets the maximum tolerance limit for dimension text. Applied when Dimtol or Dimlim is on. |
| [Dimtsz](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtsz/) { get; set; } | Gets or sets mode of drawing strokes and arrowheads for linear, radius, and diameter diensions. If the value is 0 arrowheads will be drawn, positive value defines the size of oblique strokes instead of arrowheads. The value is multiplied by the Dimscale. |
| [Dimtvp](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtvp/) { get; set; } | Gets or sets the vertical position of dimension text above or below the dimension line. |
| [Dimtxsty](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtxsty/) { get; set; } | Gets or sets the text style name of the dimension. |
| [Dimtxt](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtxt/) { get; set; } | Gets or sets the height of dimension text. |
| [DimTxtDirection](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtxtdirection/) { get; set; } | Gets or sets the reading direction of the text in dimension. 0 (false) value corresponds to left-to-right, 1 (true) corresponds to right-to-left. |
| [Dimtzin](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimtzin/) { get; set; } | Gets or sets the suppression of zeros in tolerance values. Possible values are: 0 (suppresses zero feet and precisely zero inches), 1 (uncludes zero feet and precisely zero inches), 2 (includes zero feet and suppresses zero inches), 3 (includes zero inches and suppresses zero feet), 4 (suppresses leading zeros), 8 (suppresses trailing zeros), 12 (suppresses both leading and trailing zeros). |
| [Dimunit](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimunit/) { get; set; } | Gets or sets the value, that was used to set units but now is replaced with Dimlunit and Dimfrac. |
| [Dimupt](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimupt/) { get; set; } | Gets or sets the mode for user-positioned text. Possible values are: 0 (cursor controls only the dimension line location), 1 (cursor controls both the text position and the dimension line location). |
| [Dimzin](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/dimzin/) { get; set; } | Gets or sets the suppression of zeros in the primary unit value. Possible values arer: 0 (suppresses zero feet and precisely zero inches), 1 (includes zero feet and precisely zero inches), 2 (includes zero feet and suppresses zero inches), 3 (includes zero inches and suppresses zero feet), 4 (bit 3, suppresses leading zeros), 8 (bit 4, suppresses trailing zeros), 12 (bit 3 and bit 4, suppresses both leading and trailing zeros). |
| [EmbeddedObjectsContainer](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/embeddedobjectscontainer/) { get; set; } | Gets or sets the embedded objects container. |
| [HandleDimstyle](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/handledimstyle/) { get; set; } | Gets or sets the handle dimstyle. |
| [HardOwner](../../aspose.cad.fileformats.cad.cadobjects/cadownedobjectbase/hardowner/) { get; set; } | Gets or sets the hard owner. |
| [IsSoftOwnerSet](../../aspose.cad.fileformats.cad.cadobjects/cadownedobjectbase/issoftownerset/) { get; } | Gets a value indicating whether soft owner is set. |
| [Numreactors](../../aspose.cad.fileformats.cad.cadobjects/cadownedobjectbase/numreactors/) { get; set; } | The Numreactors |
| [ObjectHandle](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/objecthandle/) { get; set; } | Gets or sets the object handle. |
| [Reactors](../../aspose.cad.fileformats.cad.cadobjects/cadownedobjectbase/reactors/) { get; set; } | Get or sets the reactors handle |
| [SoftOwner](../../aspose.cad.fileformats.cad.cadobjects/cadownedobjectbase/softowner/) { get; set; } | Gets or sets the soft owner. |
| [StandardFlag](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/standardflag/) { get; set; } | Gets or sets the standard flag bit-coded values. Possible values are: 16 (table entry is externally dependent on an xref), 32 and 16 (the externally dependent xref has been successfully resolved), 64 (the table entry was referenced by at least one entity in the drawing the last time the drawing was edited. |
| virtual [StorageFlag](../../aspose.cad.fileformats.cad.cadobjects/cadownedobjectbase/storageflag/) { get; set; } | Gets or sets a value indicating that this entity has associated binary data in the data store. |
| [StyleName](../../aspose.cad.fileformats.cad.cadtables/caddimensionstyletable/stylename/) { get; set; } | Gets or sets the dimension style name. |
| [XdataContainer](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/xdatacontainer/) { get; set; } | Gets or sets the xdata container. |

## Methods

| Name | Description |
| --- | --- |
| [GetUID](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/getuid/)() | Identifier to use if object handle doesn't work. Done as method not to disturb FileComparer's property comparer |
| [SetUID](../../aspose.cad.fileformats.cad.cadobjects/cadobjectbase/setuid/)(string) | Sets |

### See Also

* class [CadOwnedObjectBase](../../aspose.cad.fileformats.cad.cadobjects/cadownedobjectbase/)
* namespace [Aspose.CAD.FileFormats.Cad.CadTables](../../aspose.cad.fileformats.cad.cadtables/)
* assembly [Aspose.CAD](../../)


