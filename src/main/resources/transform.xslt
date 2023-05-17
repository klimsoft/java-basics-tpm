<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <bookstore>
            <fiction_books>
                <total_price>
                    <xsl:value-of select="sum(/bookstore/book[@category='fiction']/price)"/>
                </total_price>
                <titles>
                    <xsl:for-each select="/bookstore/book[@category='fiction']">
                        <title>
                            <xsl:value-of select="title"/>
                        </title>
                    </xsl:for-each>
                </titles>
            </fiction_books>
        </bookstore>
    </xsl:template>

</xsl:stylesheet>