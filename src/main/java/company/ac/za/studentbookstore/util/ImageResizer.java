package company.ac.za.studentbookstore.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * This program demonstrates how to resize an image.
 *
 * @author www.codejava.net
 *
 */
public class ImageResizer {

    /**
     * Resizes an image to a absolute width and height (the image may not be
     * proportional)
     * @param inputImagePath Path of the original image
     * @param outputImagePath Path to save the resized image
     * @param scaledWidth absolute width in pixels
     * @param scaledHeight absolute height in pixels
     * @throws IOException
     */
    public static void resize(String inputImagePath, String outputImagePath, int scaledWidth, int scaledHeight)
            throws IOException {
        // reads input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // creates output image
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());

        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        // extracts extension of output file
        String formatName = outputImagePath.substring(outputImagePath.lastIndexOf(".") + 1);

        // writes to output file
        ImageIO.write(outputImage, formatName, new File(outputImagePath));
    }

    /**
     * Resizes an image by a percentage of original size (proportional).
     * @param inputImagePath Path of the original image
     * @param outputImagePath Path to save the resized image
     * @param percent a double number specifies percentage of the output image
     * over the input image.
     * @throws IOException
     */
    public static void resize(String inputImagePath,
                              String outputImagePath, double percent) throws IOException {
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        int scaledWidth = (int) (inputImage.getWidth() * percent);
        int scaledHeight = (int) (inputImage.getHeight() * percent);
        resize(inputImagePath, outputImagePath, scaledWidth, scaledHeight);
    }

    /**
     * Test resizing images
     */
    public static void getResizedImage() throws IOException {
        String inputImagePath = "src/main/java/company/ac/za/studentbookstore/util/output.JPG";
        String outputImagePath1 = "src/main/java/company/ac/za/studentbookstore/util/resized.jpg";


        BufferedImage bimg = ImageIO.read(new File(inputImagePath));
        System.out.println(bimg.getWidth()+"<<<width||height>>>>"+bimg.getHeight());

        double percent=0;
        if(bimg.getWidth()>=5000){
            try{
                 percent = 0.16;
                ImageResizer.resize(inputImagePath, outputImagePath1, percent);
            } catch (IOException ex) {
            System.out.println("Error resizing the image.");
            ex.printStackTrace();
        }

        }else if(bimg.getWidth()>=3000){
            try{
                percent = 0.27;
                ImageResizer.resize(inputImagePath, outputImagePath1, percent);
            } catch (IOException ex) {
                System.out.println("Error resizing the image.");
                ex.printStackTrace();
            }
        }else if(bimg.getWidth()>=1000){
            try {
                percent = 0.8;
                ImageResizer.resize(inputImagePath, outputImagePath1, percent);

            } catch (IOException ex) {
                System.out.println("Error resizing the image.");
                ex.printStackTrace();
            }

        }else
            try {
                percent = 1;
                ImageResizer.resize(inputImagePath, outputImagePath1, percent);

            } catch (IOException ex) {
                System.out.println("Error resizing the image.");
                ex.printStackTrace();
            }



    }

}