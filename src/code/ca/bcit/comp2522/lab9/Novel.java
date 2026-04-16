package ca.bcit.comp2522.lab9;

/**
 * Represents a classic novel with its attributes.
 *
 * @author Abdullah Munawar Set D
 * @author Arsen Madi       Set D
 * 
 * @version 1.0
 */
public final class Novel
{   
    private static final int MIN_YEAR = 0;

    private final String title;
    private final String authorName;
    private final int    yearPublished;

    /**
     * Constructs a Novel object.
     * @param title         the title of the novel
     * @param authorName    the name of the author
     * @param yearPublished the year the novel was first published
     */
    public Novel(final String title,
                 final String authorName,
                 final int    yearPublished)
    {
        validateTitle(title);
        validateAuthorName(authorName);
        validateYearPublished(yearPublished);

        this.title         = title;
        this.authorName    = authorName;
        this.yearPublished = yearPublished;
    }

    /*
     * Validates the title of the novel.
     *
     * @param title the title to validate
     * @throws IllegalArgumentException if the title is not valid
     */
    private static void validateTitle(final String title)
    {
        if (title == null ||
            title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
    }

    /*
     * Validates the author's name.
     *
     * @param authorName the author name to validate
     * @throws IllegalArgumentException if the author name is not valid
     */
    private static void validateAuthorName(final String authorName)
    {
        if (authorName == null ||
            authorName.isBlank())
        {
            throw new IllegalArgumentException("Author name cannot be null or blank");
        }
    }

    /*
     * Validates the year the novel was published.
     *
     * @param yearPublished the year to validate
     * @throws IllegalArgumentException if the year is not valid
     */
    private static void validateYearPublished(final int yearPublished)
    {
        if (yearPublished <= MIN_YEAR)
        {
            throw new IllegalArgumentException("Year published must be positive");
        }
    }

    /**
     * Returns the title of the novel.
     * @return title as a String
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the author's name.
     * @return authorName as a String
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Returns the year the book was published.
     * @return yearPublished as an int
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
