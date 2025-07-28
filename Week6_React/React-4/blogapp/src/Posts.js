import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  // Load custom blog posts on mount
  componentDidMount() {
    this.loadPosts();
  }

  // Instead of fetching, use curated content
  loadPosts() {
    try {
      const posts = [
        new Post(
          1,
          "How I Got Started with React",
          "Starting with React was overwhelming at first, but breaking it down into components and understanding the JSX syntax made it so much fun! Now, I enjoy building fast, interactive UIs."
        ),
        new Post(
          2,
          "The Power of Component Reusability",
          "One of React’s biggest strengths is its ability to let you reuse components. This makes development faster, cleaner, and easier to maintain. Build once, use everywhere!"
        ),
        new Post(
          3,
          "Styling React Apps the Smart Way",
          "There are multiple ways to style your React app — CSS Modules, Styled Components, and plain CSS. Choose what fits your team and keep things consistent. I personally love CSS Modules for scope control!"
        ),
        new Post(
          4,
          "Lifecycle Methods: Why They Matter",
          "Lifecycle methods like componentDidMount() and componentDidCatch() help you manage side effects and handle errors gracefully. They give you more control over your component’s behavior."
        ),
        new Post(
          5,
          "Tips to Keep Your React Code Clean",
          "Use meaningful variable names, separate logic into custom hooks or utilities, and never underestimate the power of comments. Clean code = happy developers!"
        )
      ];
      this.setState({ posts });
    } catch (error) {
      this.setState({ error: error.message });
    }
  }

  // Handle rendering errors gracefully
  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.toString());
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <p style={{ color: 'red' }}>Error: {error}</p>;
    }

    return (
      <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
        <h2 style={{ color: '#2c3e50' }}>📝 Blog Posts</h2>
        {posts.map((post) => (
          <div key={post.id} style={{ marginBottom: '30px' }}>
            <h3 style={{ color: '#34495e' }}>{post.title}</h3>
            <p style={{ fontSize: '16px', lineHeight: '1.6' }}>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
